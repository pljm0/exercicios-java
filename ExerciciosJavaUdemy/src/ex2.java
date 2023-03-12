import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

       // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
        // círculo com quatro casas decimais conforme exemplos.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        System.out.printf("A=%.4f", Math.pow(raio, 2)*3.14159);

    }
}
