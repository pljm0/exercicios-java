import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        /* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

        int i;

        System.out.println("Digite a quantidade de testes: ");
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        for(i = 0;i < n1;i++) {
            System.out.println("Digite o primeiro valor: ");
            int n2 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int n3 = scanner.nextInt();

            if(n3 == 0) {
                System.out.println("Divisao Impossivel.");

            }else {
                double div = (double) n2 / n3;
                System.out.printf("Resultado: %.1f%n", div);

            }

        }

    }
}
