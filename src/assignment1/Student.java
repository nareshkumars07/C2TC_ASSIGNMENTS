package assignment1;

public class Student {
	int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
		// TODO Auto-generated constructor stub
	}

	// Method to display student details
    public void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("---------------------");
}
}
