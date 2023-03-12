import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        if(n1 % 2 == 0) {
            System.out.println("Esse número é par.");

        }else {
            System.out.println("Esse número é ímpar.");
        }
    }
}
