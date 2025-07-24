package assignment1;
import java.util.Scanner;
public class ProductDemo {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Product[] products = new Product[4];

	        for (int i = 0; i < 4; i++) {
	            System.out.println("Enter details for Product " + (i + 1));
	            System.out.print("Enter Product ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); // consume newline

	            System.out.print("Enter Product Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Product Price: ");
	            double price = sc.nextDouble();

	            products[i] = new Product(id, name, price);
	            System.out.println();
	        }

	        System.out.println("------ Product Details ------");
	        for (Product p : products) {
	            p.display();
	        }

	        sc.close();

	}

}
