package assignment1;

public class Product {
	int id;
    String name;
    double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product Price: ₹" + price);
        System.out.println("----------------------------");
    }
}
