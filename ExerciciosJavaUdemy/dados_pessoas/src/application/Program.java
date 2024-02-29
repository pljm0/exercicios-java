package application;

import entities.Dados;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Dados[] vect = new Dados[n];

        for(int i=0;i<vect.length;i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            double height = scanner.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            char genre = scanner.next().charAt(0);

            vect[i] = new Dados(height, genre);

        }

        double menor = 10.0;
        double maior = 0.0;

        for(int i=0;i<vect.length;i++) {
            if(vect[i].getHeight() > maior) {
                maior = vect[i].getHeight();

            }

        }

        for(int i=0;i<vect.length;i++) {
            if(vect[i].getHeight() < menor) {
                menor = vect[i].getHeight();

            }

        }

        double soma = 0.0;
        int mquantidade = 0;

        for(int i=0;i<vect.length;i++) {
            if(vect[i].getGenre() == 'F') {
                soma += vect[i].getHeight();
                mquantidade++;

            }

        }

        double avgm = soma / mquantidade;

        int hquantidade = 0;

        for(int i=0;i<vect.length;i++) {
            if (vect[i].getGenre() == 'M') {
                hquantidade++;

            }
        }

        System.out.printf("Menor altura: %.2f", menor);
        System.out.printf("\nMaior altura: %.2f", maior);
        System.out.printf("\nMedia das alturas das mulheres %.2f", avgm);
        System.out.println("\nNumero de homens = " + hquantidade);

    }

}
