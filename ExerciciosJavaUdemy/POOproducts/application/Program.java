package application;

import entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        product.setName(scanner.nextLine());

        System.out.print("Price: ");

        product.setPrice(scanner.nextDouble());

        System.out.print("Quantity in stock: ");

        product.setQuantity(scanner.nextInt());

        System.out.println("Product data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");

        product.addProducts(scanner.nextInt());

        System.out.println("Updated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");

        product.removeProducts(scanner.nextInt());

        System.out.println("Updated data: " + product);

    }

}
