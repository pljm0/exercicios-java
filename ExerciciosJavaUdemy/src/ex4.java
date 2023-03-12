import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe
        // por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com
        // duas casas decimais.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o numero de horas trabalhadas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite o valor que o funcionario recebe por hora: ");
        double valor = scanner.nextDouble();

        System.out.println("NUMBER: " + numero);
        System.out.printf("SALARY: U$%.2f", horas*valor);
    }
}
