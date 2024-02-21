package application;

import entities.Bank;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accnumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter account holder: ");
        String accholder = scanner.nextLine();

        Bank bank = new Bank(accnumber, accholder);

        System.out.println("Is there an initial deposit (y/n)?");
        String check = scanner.nextLine();

        if(check.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            bank.doDeposit(scanner.nextDouble());
            System.out.println("\nAccount data: ");
            System.out.println(bank);

        }

        System.out.println("\nEnter a deposit value: ");
        bank.doDeposit(scanner.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println("\nEnter a withdraw value: ");
        bank.doWithdraw(scanner.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(bank);

    }

}
