import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do
        // produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor A:");
        int a = scanner.nextInt();
        System.out.println("Valor B:");
        int b = scanner.nextInt();
        System.out.println("Valor C:");
        int c = scanner.nextInt();
        System.out.println("Valor D:");
        int d = scanner.nextInt();

        System.out.printf("DIFERENCA: %d", (a * b) - (c * d));
    }
}
