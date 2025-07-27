package assignment3;

public class Main {
	public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Create Commission object using constructor
        Commission emp = new Commission("Naresh", "Pondy", "7904301577", 100000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Phone: " + emp.getPhone());
        System.out.println("Sales Amount: ₹" + emp.getSalesAmount());

        emp.setSalesAmount(85000);
        System.out.println("Updated Sales Amount: ₹" + emp.getSalesAmount());
    }
}
