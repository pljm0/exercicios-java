import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1;

        System.out.println("Digite um numero: ");
        n1 = scanner.nextInt();
        number(n1);

    }
        static void number(int n1) {
            System.out.println("O antecessor do munero " + n1 + " eh: " + (n1 - 1) +
                    " \nE o sucessor do numero " + n1 + " eh: " + (n1 + 1));
            System.out.println("O dobro do munero " + n1 + " eh: " + (n1 * 2) +
                    " \nE o triplo do numero " + n1 + " eh: " + (n1 * 3));
            System.out.println("A raiz quadrada do numero " + n1 + " eh: " + (Math.sqrt(n1)));

    }

}
