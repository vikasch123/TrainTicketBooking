package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.Ticket;
import org.example.entities.User;
import org.example.entities.User;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

//import static jdk.internal.org.jline.utils.InfoCmp.Capability.user1;

public class UserBookingService {
    private User user; //as for at a time only one user will take all the services so we declare it as a global variable
    private   ObjectMapper objectMapper = new ObjectMapper();
    private List<User> userList;

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File("java/org/example/localDb/users.json");
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public UserBookingService() throws IOException {
       loadUsers();
    }

    public List<User> loadUsers() throws IOException{
        File users = new File("java/org/example/localDb/users.json");
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
        return userList;
    }


    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException {

        File usersFile = new File("java/org/example/localDb/users.json");
        objectMapper.writeValue(usersFile, userList);
    }

    public void fetchBooking(){
        user.printTickets();
    }

    public Boolean cancelBooking() throws IOException {
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();

        if (foundUser.isPresent()) {
            User user = foundUser.get();
            List<Ticket> ticketsBooked = user.getTicketsBooked();
            for (Ticket ticket : ticketsBooked) {
                if (ticket.getStatus().equals("booked")) {
                    ticket.setStatus("cancelled");
                    saveUserListToFile();
                    return true;
                }
            }
        }
        return false;
    }

    public void signUp(String nameToSignup, String passwordToSignup) {
    }
}
