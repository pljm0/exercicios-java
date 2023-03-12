import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule
        // e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a1 = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b2 = scanner.nextDouble();
        System.out.println("Digite o valor de C:");
        double c3 = scanner.nextDouble();

        System.out.printf("TRIANGULO: %.3f", a1 * c3 / 2);
        System.out.printf("\nCIRCULO: %.3f", Math.pow(c3, 2) * 3.14159);
        System.out.printf("\nTRAPEZIO: %.3f", (a1 + b2) * c3 / 2);
        System.out.printf("\nQUADRADO: %.3f", b2 * b2);
        System.out.printf("\nRETANGULO: %.3f", a1 * b2);
    }
}
