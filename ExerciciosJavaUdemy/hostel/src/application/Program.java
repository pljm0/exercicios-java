package application;

import entities.Rent;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quartos vao ser alugados? ");
        int n = scanner.nextInt();

        Rent[] vect = new Rent[10];

        for(int i=1;i<=n;i++) {
            System.out.printf("\nAluguel #%d", i);
            scanner.nextLine();
            System.out.println("\nNome: ");
            String name = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Quarto: ");
            int room = scanner.nextInt();

            vect[room-1] = new Rent(name, email);

        }

        System.out.println("\nQuartos ocupados: ");

        for(int i=0;i<vect.length;i++) {
            if(vect[i] != null) {
                System.out.println(vect[i] + ": " + vect[i].getName() + ", " + vect[i].getEmail());

            }

        }

    }

}
