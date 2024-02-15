package application;

import entities.Rectangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.setWidth(scanner.nextDouble());
        rectangle.setHeight(scanner.nextDouble());

        System.out.println(rectangle);

    }

}
