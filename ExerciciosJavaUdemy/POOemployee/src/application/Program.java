package application;

import entities.Employee;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.setName(scanner.nextLine());

        System.out.println("Gross salary: ");
        employee.setGrosssalary(scanner.nextDouble());

        System.out.println("Tax: ");
        employee.setTax(scanner.nextDouble());

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println("Updated data: " + employee);

    }

}
