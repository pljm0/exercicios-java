import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
        // digitados em ordem crescente ou decrescente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int n2 = scanner.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao multiplos.");

        }else {
            System.out.println("Não sao multiplos.");
        }
    }
}
