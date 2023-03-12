import java.util.Scanner;

public class MetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos metros tem a largura da parede: ");
        float width = scanner.nextFloat();
        System.out.println("Digite quantos metros tem a altura da parede: ");
        float height = scanner.nextFloat();
        doCalc(width, height);
    }
    static void doCalc(float width, float height) {
        System.out.printf("A parede possui %.2fm2", width * height);
    }
}
