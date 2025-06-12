package ClassesAndObjects.StudentMangementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        admin manager = new admin();
        while (true) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int Id = sc.nextInt();
                    sc.nextLine(); // flush
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    Student s = new Student(name, Id, age, course);
                    manager.addStudent(s);
                    System.out.println("\n Student added Succesfully");
                    break;
                case 2:
                    manager.ViewAllStudent();
                    break;
                case 3:
                    System.out.println("Enter Student id ");
                    int Studentid = sc.nextInt();
                    Student found = manager.findStudentById(Studentid);
                    if (found != null) {
                        found.displayStudent();
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Id");
                    int removeStudent = sc.nextInt();
                    manager.removeStudentById(removeStudent);
                    break;
                case 5:
                    System.out.println("Exiting .....");
                    break;

            }
        }
    }
}