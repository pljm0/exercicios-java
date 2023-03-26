import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {

        /*
        Ler um número inteiro N e calcular todos os seus divisores.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Os divisores do numero " + n1 + " sao:");
        for(int i=1; i<=n1; i++) {
            if(n1 % i == 0) {
                System.out.println(i);

            }

        }

    }
}
