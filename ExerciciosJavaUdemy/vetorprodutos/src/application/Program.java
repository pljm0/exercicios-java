package application;

import entities.Produtos;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        Produtos[] produtos = new Produtos[n];

        for(int i=0;i<produtos.length;i++) {
            String productName = scanner.nextLine();
            double productPrice = scanner.nextDouble();
            scanner.nextLine();
            produtos[i] = new Produtos(productName, productPrice);

        }

        double media = 0.0;

        for(int i=0;i< produtos.length;i++) {
            media += produtos[i].getProductPrice();

        }

        double avg = media / produtos.length;
        System.out.println("average: " + avg);


    }

}
