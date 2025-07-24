package assignment2;

import assignment1.Student;

public class CommisionDemo {
	public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Create Commission object using constructor
        Commision emp = new Commision("Naresh", "Pondicherry", "7904301577", 000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Phone: " + emp.getPhone());
        System.out.println("Sales Amount: ₹" + emp.getSalesAmount());

        emp.setSalesAmount(85000);
        System.out.println("Updated Sales Amount: ₹" + emp.getSalesAmount());
    }
}
