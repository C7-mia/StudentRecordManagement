import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- UNIVERSITY RECORD MANAGEMENT ---");
            System.out.println("1. Add Student\n2. Update Student\n3. View All Students\n4. Exit");
            System.out.print("Choice: ");

            String input = scanner.nextLine();
            
            try {
                int choice = Integer.parseInt(input);
                switch (choice) {
                    case 1:
                        System.out.print("Name: "); String name = scanner.nextLine();
                        System.out.print("ID: "); int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Age: "); int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Grade: "); String grade = scanner.nextLine();
                        StudentManagement.addStudent(name, id, age, grade);
                        break;
                    case 2:
                        System.out.print("ID to Update: "); int uid = Integer.parseInt(scanner.nextLine());
                        System.out.print("New Name: "); String uname = scanner.nextLine();
                        System.out.print("New Age: "); int uage = Integer.parseInt(scanner.nextLine());
                        System.out.print("New Grade: "); String ugrade = scanner.nextLine();
                        StudentManagement.updateStudent(uid, uname, uage, ugrade);
                        break;
                    case 3:
                        StudentManagement.viewStudents();
                        break;
                    case 4:
                        System.out.println("System closed.");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }
    }
}
