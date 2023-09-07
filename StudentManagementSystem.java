package codessoftweek1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
	private List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public static void main(String[] args) {
		StudentManagementSystem system = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Student Management System");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Exit");
			System.out.print("Select an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter Student ID: ");
				String id = scanner.nextLine();
				System.out.print("Enter Student Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Student Age: ");
				int age = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character

				Student newStudent = new Student(id, name, age);
				system.addStudent(newStudent);
				System.out.println("Student added successfully!");
				break;
			case 2:
				List<Student> allStudents = system.getAllStudents();
				if (allStudents.isEmpty()) {
					System.out.println("No students found.");
				} else {
					System.out.println("All Students:");
					for (Student student : allStudents) {
						System.out.println(student);
					}
				}
				break;
			case 3:
				System.out.println("Exiting the application. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}
	}
