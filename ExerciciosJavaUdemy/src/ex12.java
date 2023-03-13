import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não
        // estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double n1 = scanner.nextDouble();

        if (n1 >= 0 && n1 <= 25) {
            System.out.println("Intervalo [0,25]");

        }else if (n1 > 25 && n1 <= 50) {
            System.out.println("Intervalo (25,50]");

        }else if (n1 > 50 && n1 <= 75) {
            System.out.println("Intervalo (50,70]");

        }else if (n1 > 75 && n1 <= 100) {
            System.out.println("Intervalo (70,100]");

        }else {
            System.out.println("Fora de intervalo");
        }

    }
}
