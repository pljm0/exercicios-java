import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Scanner scanner = new Scanner(System.in);


        System.out.println("CÓDIGO        ESPECIFICAÇÃO        PREÇO" +
                           "\n1             Cachorro Quente      R$4,00" +
                           "\n2             X-Salada             R$4,50" +
                           "\n3             X-Bacon              R$5,00" +
                           "\n4             Torrada Simples      R$2,00" +
                           "\n5             Refrigerante         R$1,50\n");


        System.out.println("Digite o código do produto: ");
        int code = scanner.nextInt();
        System.out.println("Digite a quantidade: ");
        int quant = scanner.nextInt();

        switch (code) {
            case 1:
                System.out.printf("Valor a ser pago: R$%.2f", quant*4.00);
                break;
            case 2:
                System.out.printf("Valor a ser pago: R$%.2f", quant*4.50);
                break;
            case 3:
                System.out.printf("Valor a ser pago: R$%.2f", quant*5.00);
                break;
            case 4:
                System.out.printf("Valor a ser pago: R$%.2f", quant*2.00);
                break;
            case 5:
                System.out.printf("Valor a ser pago: R$%.2f", quant*1.50);
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }
    }
}
