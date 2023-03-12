import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1;

        System.out.println("Digite um valor em metros: ");
        n1 = scanner.nextDouble();
        doConversion(n1);


    }

    static void doConversion(double n1) {
        System.out.printf("%.2f metros equivale a \n%.2fkm %n", n1, (n1/1000));
        System.out.printf("%.2fhm %n", (n1 / 100));
        System.out.printf("%.2fdam %n", (n1 / 10));
        System.out.printf("%.2fdm %n", (n1 * 10));
        System.out.printf("%.2fcm %n", (n1 * 100));
        System.out.printf("%.2fmm ", (n1 * 1000));
    }
}
