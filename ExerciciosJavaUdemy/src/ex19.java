import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste
        consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um
        destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro
        valor tem peso 5. */

        int i;

        System.out.println("Digite o numero de casos de teste: ");
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        for(i = 0;i < n1; i++) {
            System.out.println("Digite a primeira nota: ");
            double d1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double d2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double d3 = scanner.nextDouble();

            System.out.printf("Media: %.1f%n", (d1 * 2.0 + d2 * 3.0 + d3 * 5.0) / 10.0);

        }
    }
}
