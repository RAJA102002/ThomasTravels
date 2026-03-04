# 🚗 ThomasTravels – Java Driver Management System

## 📌 Overview
ThomasTravels is a Java console-based application designed to manage and analyze driver travel data.  
The system allows users to retrieve driver details, filter drivers by category, and determine the driver who has traveled the maximum distance.

This project demonstrates core Java concepts such as Object-Oriented Programming (OOP), Collections, and method-based data processing.

---

## 🛠️ Tech Stack
- Java
- ArrayList (Java Collections Framework)
- OOP Concepts

---

## 📂 Project Structure

ThomasTravels/
│── src/
│   │── Driver.java
│   │── Travel.java
│   │── TestDriver.java

---

## 🧱 Classes Description

### 1️⃣ Driver.java
Represents a driver entity with the following attributes:
- driverId (int)
- driverName (String)
- category (String)
- totalDistance (double)

Includes:
- Constructor
- Getter methods

---

### 2️⃣ Travel.java
Contains business logic methods:

- `isCarDriver(Driver driver)`  
  ➜ Checks whether the driver belongs to "Car" category.

- `RetrivebyDriverId(ArrayList<Driver>, int id)`  
  ➜ Retrieves driver details by ID.

- `RetriveCountOfDriver(ArrayList<Driver>, String category)`  
  ➜ Returns count of drivers in a category.

- `retriveDriver(ArrayList<Driver>, String category)`  
  ➜ Returns list of drivers by category.

- `RetriveMaximumDistanceTravelledDriver(ArrayList<Driver>)`  
  ➜ Finds the driver who traveled the maximum distance.

---

### 3️⃣ TestDriver.java
Main class of the application.
- Creates driver objects
- Adds them to ArrayList
- Calls Travel class methods
- Prints results to console

---

## ▶️ How to Run

1. Clone the repository:

2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)

3. Run `TestDriver.java` as a Java Application

---

## 📌 Sample Output

true
Driver name is Sudhagar belonging to the category Car traveled 4200.0 KM so far.
Car Drivers Count: 2
Sudhagar
Mahesh
Maximum Distance Travelled by: Suresh


---

## 🎯 Learning Objectives

✔ Understand Java Classes & Objects  
✔ Practice ArrayList usage  
✔ Implement filtering & searching logic  
✔ Work with methods and control flow  

---

## 🚀 Future Improvements

- Add user input instead of hardcoded values  
- Convert to GUI application  
- Add database integration  
- Implement sorting functionality  

---

## 📄 License
This project is for educational purposes.

