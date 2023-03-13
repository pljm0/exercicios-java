import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a hora inicial: ");
        int horainicial = scanner.nextInt();
        System.out.println("Insira a hora final: ");
        int horafinal = scanner.nextInt();

        if(horainicial < horafinal) {
            System.out.printf("Duração: %d hora(s)", (horainicial - horafinal) * -1);

        }else {
            System.out.printf("Duração: %d hora(s)", 24 - (horainicial - horafinal));
        }
    }
}
