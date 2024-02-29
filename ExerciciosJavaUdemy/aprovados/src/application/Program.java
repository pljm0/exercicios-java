package application;

import entities.Aprovados;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();

        Aprovados[] vect = new Aprovados[n];

        for(int i=0;i<vect.length;i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
            scanner.nextLine();
            String name = scanner.nextLine();
            double grade1 = scanner.nextDouble();
            double grade2 = scanner.nextDouble();
            vect[i] = new Aprovados(name, grade1, grade2);

        }

        System.out.println("\nAlunos aprovados: ");

        double media = 0.0;

        for(int i=0;i<vect.length;i++) {
            media = (vect[i].getGrade1() + vect[i].getGrade2()) / 2;
            if(media >= 6) {
                System.out.println(vect[i].getName());

            }

        }


    }

}
