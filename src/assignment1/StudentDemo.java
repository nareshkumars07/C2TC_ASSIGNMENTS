package assignment1;
import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            students[i] = new Student(id, name, age);
            System.out.println();
        }

        System.out.println("------ Student Details ------");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }

	}
