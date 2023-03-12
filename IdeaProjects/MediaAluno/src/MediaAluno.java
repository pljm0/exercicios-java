import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        String name;

        System.out.println("Digite o nome do aluno: ");
        name = scanner.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = scanner.nextDouble();
        doCalc(n1, n2, name);

    }

    static void doCalc(double n1, double n2, String name) {
        System.out.println("A media do aluno " + name + " eh: " + ((n1 + n2) / 2));
    }

}
