import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
        // inclusive o X, se for o caso.

        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Digite um numero inteiro: ");
        int n1 = scanner.nextInt();

        for(i = 0;i <= n1;i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
