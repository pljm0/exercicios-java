import java.util.Scanner;

public class DataDeNascimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        System.out.println("Digite o dia em que voce nasceu: ");
        dia = scanner.nextInt();
        System.out.println("Digite o mes em que voce nasceu: ");
        mes = scanner.nextInt();
        System.out.println("Digite o ano em que voce nasceu: ");
        ano = scanner.nextInt();

        System.out.println(dia + "/" + mes + "/" + ano );

    }
}
