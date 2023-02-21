package exercise01;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Product product = new Product();
        
        System.out.println("Enter product data:");
        System.out.print("Name:");
        product.name = sc.nextLine();
        
        System.out.print("Price:");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity:");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        product.AddProducts(sc.nextInt());
        System.out.println("Updatedata: " + product);
        
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        product.RemoveProducts(sc.nextInt());
        System.out.println("Updatedata: " + product);
        
        sc.close();

	}

}
