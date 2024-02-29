package application;

import entities.Pessoas;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Pessoas[] vect = new Pessoas[n];

        for(int i=0;i<vect.length;i++) {
            scanner.nextLine();
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.println("\nNome: ");
            String name = scanner.nextLine();
            System.out.println("Idade: ");
            int age = scanner.nextInt();
            System.out.println("Altura: ");
            double height = scanner.nextDouble();

            vect[i] = new Pessoas(name, age, height);

        }

        double sum = 0.0;

        for(int i=0;i<vect.length;i++) {
            sum += vect[i].getHeight();

        }

        double avg = sum / vect.length;

        System.out.printf("Altura media: %.2f", avg);

        int minor = 0;
        for(int i=0;i<vect.length;i++) {
            if(vect[i].getAge() < 16) {
                minor++;

            }

        }

        double percent = minor * 100 / n;

        System.out.println("\nPessoas com menos de 16 anos: " + percent + "%");

        for(int i=0;i<vect.length;i++) {
            if(vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());;

            }

        }

    }

}
