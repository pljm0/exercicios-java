import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("SOMA: " + soma);
    }
}
