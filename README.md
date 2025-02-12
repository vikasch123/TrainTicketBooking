# 🚆 Train Ticket Booking Management System

Welcome to the **Train Ticket Booking Management System**! 🎉 This project demonstrates a console-based train ticket booking system built entirely in **Core Java**, without relying on external frameworks like Spring. The system incorporates modern Java concepts and techniques to deliver a clean and efficient implementation. 🖥️

## ✨ Features

- 🛠️ **Object-Oriented Design:** Utilizes OOP principles like inheritance, polymorphism, encapsulation, and abstraction.
- ⚡ **Functional Programming:** Leverages streams, lambdas, and functional interfaces for concise and expressive code.
- 🧐 **Optional API:** Prevents `NullPointerException` by handling nullable values effectively.
- 📊 **Maps for Data Storage:** Organizes and manages data efficiently using maps.
- 💾 **Serialization & Deserialization:** Implements serialization and deserialization using `ObjectMapper` to persist and retrieve data.
- 📂 **Local Database:** Uses a `.json` file as a local database to store train, user, and booking details.
- 🧑‍💻 **Streamlined User Experience:** Supports the following operations:
  - 🚉 Search for trains
  - 🎫 Book tickets
  - ❌ Cancel tickets
  - 📜 View booking history
  - 🕒 View train schedule

## 🛠️ Technology Stack

- **Language:** Java (Core Java)
- **JSON Handling:** ObjectMapper from the Jackson library
- **Data Storage:** JSON file

## 📂 Project Structure

```plaintext
src/main/java/
├── models/          # Data models for train, user, and bookings
├── services/        # Core business logic and service layer
├── utils/           # Utility classes for common tasks
├── database/        # JSON file handling for local storage
└── app/             # Entry point and main application logic
```

## 🚀 How It Works

1. **📂 Database Initialization:** A `.json` file acts as the local database, preloaded with train details.
2. **🔄 Serialization/Deserialization:** Data is read from and written to the JSON file using `ObjectMapper`.
3. **🧑‍💻 User Interaction:**
   - The console interface enables users to perform various operations interactively.
   - Input validation and feedback are provided to enhance usability.
4. **⚡ Stream API:** Streamlined data processing, such as filtering train schedules or booking records.

## 🔧 Setup and Usage

1. **📥 Clone the Repository:**
   ```bash
   git clone https://github.com/vikasch123/TrainTicketBooking.git
   ```

2. **⚙️ Compile the Project:**
   ```bash
   javac -d bin src/main/java/**/*.java
   ```

3. **▶️ Run the Application:**
   ```bash
   java -cp bin app.Main
   ```

4. **🎮 Follow On-Screen Instructions:** Use the console to navigate through options like booking, canceling, or viewing tickets.

## 📄 Sample JSON Data

Below is an example of the JSON file structure used as the local database:

```json
{
  "trains": [
    {
      "trainId": "12345",
      "trainName": "Express",
      "source": "CityA",
      "destination": "CityB",
      "availableSeats": 100,
      "departureTime": "10:00 AM"
    }
  ],
  "users": [],
  "bookings": []
}
```

## 💡 Concepts Used

- **🛠️ Object-Oriented Programming (OOP):**
  - Encapsulation to group related fields and methods.
  - Inheritance to reuse and extend functionality.
  - Polymorphism to handle dynamic method invocation.
- **⚡ Streams and Lambdas:** Simplifies data processing and iteration.
- **🔄 Serialization/Deserialization:** Ensures data persistence between program runs.
- **🧩 Functional Interfaces:** Provides flexibility and reusability of functional logic.

## 🚧 Future Enhancements

- 🖥️ Integrate a graphical user interface (GUI) for a more user-friendly experience.
- 🤝 Add multi-threading to handle concurrent booking operations.
- 🌐 Implement a REST API for remote access to the booking system.
- 🔒 Introduce role-based access control (e.g., admin and user roles).

## 📸 Screenshots

Include relevant screenshots here to showcase the application's functionality. 📷

## 🤝 Contributing

Contributions are welcome! 🛠️ If you have suggestions or improvements, feel free to create a pull request.

## 📜 License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

Feel free to explore and enhance the Train Ticket Booking Management System. 🚂 Happy coding! 😄
Frontend yet to be build!!
