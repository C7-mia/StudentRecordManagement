##Student Record Management System
Course: CS 1102 - Programming 1

Student: Akena Nicholas

Institution: University of the People

##1. Project Description
This repository contains a robust Student Record Management System implemented in Java. The system allows administrators to perform CRUD (Create, Read, Update) operations on student data through a menu-driven interface.

The primary objective of this project is to demonstrate:

Encapsulation: Using private instance variables and public accessors.

Static vs. Non-Static: Utilizing static memory for global data management and instance memory for individual object state.

Exception Handling: Ensuring system stability through input validation and error catching.

###2. File Structure
The project is organized into three main Java classes to maintain the Separation of Concerns principle:

Student.java: The blueprint class (Model) that stores individual student attributes.

StudentManagement.java: The controller class that manages the shared student list using static variables and methods.

MainApp.java: The entry point (View) that handles user interaction and the main execution loop.

##3. Technical Requirements Met
Student Data Storage: Uses individual private variables for name, id, age, and grade.

Static Management: The list of students is stored in a private static ArrayList, ensuring data persistence across the application's runtime.

Error Handling: The system handles NumberFormatException during menu selection and data entry, and provides specific feedback if a Student ID is not found during an update.

##4. Setup and Installation
Prerequisites
Java Development Kit (JDK) 8 or higher.

A terminal or command-line interface.

Running the Application
Clone or Download the source files to a single directory.

Open your terminal and navigate to that directory.

Compile all Java files:

Bash
javac *.java
Execute the program:

Bash
java MainApp
5. Usage Guide
When the application starts, follow the on-screen menu prompts:

Option 1 (Add): Enter the student's name, unique integer ID, age, and letter grade.

Option 2 (Update): Provide the ID of an existing student to modify their records.

Option 3 (View): Display all records currently saved in the system's static memory.

Option 4 (Exit): Terminate the session.

6. Academic Integrity & References
This project was developed for academic purposes at the University of the People.

Textbook: Eck, D. J. (2022). Introduction to programming using Java.

Video Resource: Neso Academy (2020). Static Variables and Static Methods in Java
