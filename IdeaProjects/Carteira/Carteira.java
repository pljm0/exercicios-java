import java.util.Scanner;

public class Carteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1;

        System.out.println("Digite o valor que voce possui na sua carteira: ");
        n1 = scanner.nextFloat();
        doConversion(n1);


    }

    static void doConversion(float n1) {
        System.out.printf("Com R$%.2f de saldo eh possivel comprar US$%.2f e EUR€%.2f", n1, n1 / 5.07, n1 / 5.54);
    }
}
