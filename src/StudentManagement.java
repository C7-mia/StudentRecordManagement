package src;

import java.util.ArrayList;

public class StudentManagement {
    // Static variables: shared by the entire system
    private static ArrayList<Student> students = new ArrayList<>();
    private static int totalStudents = 0;

    public static void addStudent(String name, int id, int age, String grade) {
        students.add(new Student(name, id, age, grade));
        totalStudents++;
        System.out.println("Success: Student added. Total: " + totalStudents);
    }

    public static void updateStudent(int id, String name, int age, String grade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setGrade(grade);
                System.out.println("Success: Record updated.");
                return;
            }
        }
        System.out.println("Error: Student ID " + id + " not found.");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("The student database is currently empty.");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }
}
