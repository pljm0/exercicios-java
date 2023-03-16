import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas de X: ");
        double xcoord = scanner.nextDouble();

        System.out.println("Digite as coordenadas de Y: ");
        double ycoord = scanner.nextDouble();

        while(xcoord != 0 && ycoord != 0) {


            if(xcoord > 0 && ycoord > 0) {
                System.out.println("primeiro");

            }else if(xcoord < 0 && ycoord > 0) {
                System.out.println("segundo");

            }else if(xcoord < 0 && ycoord < 0) {
                System.out.println("terceiro");

            }else{
                System.out.println("quarto");

            }
            xcoord = scanner.nextDouble();
            ycoord = scanner.nextDouble();
        }


    }
}
