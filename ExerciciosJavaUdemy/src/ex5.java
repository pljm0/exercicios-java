import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1:");
        int codigo1 = scanner.nextInt();
        System.out.println("Digite o numero de peças:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o valor unitario de cada peça:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o codigo da peça 2:");
        int codigo2 = scanner.nextInt();
        System.out.println("Digite o numero de peças:");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o valor unitario de cada peça:");
        double valor2 = scanner.nextDouble();

        System.out.printf("Valor a pagar: R$%.2f", (numero1 * valor1) + (numero2 * valor2));
    }
}
