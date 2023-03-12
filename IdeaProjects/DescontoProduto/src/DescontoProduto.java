import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float n1 = scanner.nextFloat();
        doCalc(n1);

    }

    static void doCalc(float n1) {
        System.out.printf("O preco do produto com 5 por cento de desconto passa a ser: R$%.2f %n", n1-(n1*5/100));
        System.out.printf("O produto a vista com 10 por cento de desconto: R$%.2f %n", n1-(n1*10/100));
        System.out.printf("O produto parcelado com 15 por cento de aumento: R$%.2f", n1+(n1*15/100));

    }
}
