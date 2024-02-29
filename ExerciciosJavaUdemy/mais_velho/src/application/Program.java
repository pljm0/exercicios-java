package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for(int i=0;i<vect.length;i++) {
            System.out.printf("Dados da %da pessoa: ", i+1);
            scanner.nextLine();
            System.out.println("\nNome: ");
            String name = scanner.nextLine();
            System.out.println("Idade: ");
            int age = scanner.nextInt();
            vect[i] = new Pessoa(name, age);

        }

        int older = 0;
        int position = 0;

        for(int i=0;i<vect.length;i++) {
            if(vect[i].getAge() > older) {
                older = vect[i].getAge();
                position = i;

            }

        }

        System.out.println("PESSOA MAIS VELHA: " + vect[position].getName());

    }

}
