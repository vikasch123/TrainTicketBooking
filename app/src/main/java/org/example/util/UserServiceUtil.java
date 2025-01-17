package org.example.util;

public class UserServiceUtil {

    public static boolean checkPassword(String password, String hashedPassword) {
        return password.equals(hashedPassword);
    }

    public static String hashPassword(String password) {
        return password;
    }

}
