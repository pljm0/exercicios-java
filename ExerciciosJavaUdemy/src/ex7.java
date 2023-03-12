import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n1 = scanner.nextInt();

        if (n1 > 0) {
            System.out.println("Esse numero é um numero positivo.");

        }else {
            System.out.println("Esse numero é um numero negativo.");
        }
    }
}
