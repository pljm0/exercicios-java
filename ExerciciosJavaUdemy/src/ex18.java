import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {

        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        int i, in = 0, out = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores inteiros que serão lidos: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite os valores: ");

        for(i = 0;i < n1;i++) {
            int numbers = scanner.nextInt();
            if(numbers >= 10 && numbers <= 20) {
                in++;

            }else {
                out++;

            }

        }

        System.out.println("in: " + in + "\nout: " + out);

    }
}
