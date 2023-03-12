import java.util.*;
class main {
    public static void main (String [] args){

        Scanner read = new Scanner(System.in);
        int option;
        double n1;
        double n2;

        System.out.println("Calculadora\n"
                + "----------------------------------\n"
                + "Digite sua operacao\n"
                + "1 - Soma\n"
                + "2 - Subtracao\n"
                + "3 - Multiplicacao\n"
                + "4 - Divisao\n"
                + "5 - Sair");

        option = read.nextInt();
        while( option != 5) {
            System.out.println("Calculadora\n"
                    + "----------------------------------\n"
                    + "Digite sua operacao\n"
                    + "1 - Soma\n"
                    + "2 - Subtracao\n"
                    + "3 - Multiplicacao\n"
                    + "4 - Divisao\n"
                    + "5 - Sair");
            if (option == 1) {
                System.out.println("Digite o primeiro numero");
                n1 = read.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = read.nextDouble();
                soma(n1, n2);
                System.out.println("Calculadora\n"
                        + "----------------------------------\n"
                        + "Digite sua operacao\n"
                        + "1 - Soma\n"
                        + "2 - Subtracao\n"
                        + "3 - Multiplicacao\n"
                        + "4 - Divisao\n"
                        + "5 - Sair");
                option = read.nextInt();
            } else if (option == 2) {
                System.out.println("Digite o primeiro numero");
                n1 = read.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = read.nextDouble();
                subtrai(n1, n2);
                System.out.println("Calculadora\n"
                        + "----------------------------------\n"
                        + "Digite sua operação\n"
                        + "1 - Soma\n"
                        + "2 - Subtracao\n"
                        + "3 - Multiplicacao\n"
                        + "4 - Divisao\n"
                        + "5 - Sair");
                option = read.nextInt();
            } else if (option == 3) {
                System.out.println("Digite o primeiro numero");
                n1 = read.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = read.nextDouble();
                multiplica(n1, n2);
                System.out.println("Calculadora\n"
                        + "----------------------------------\n"
                        + "Digite sua operação\n"
                        + "1 - Soma\n"
                        + "2 - Subtracao\n"
                        + "3 - Multiplicacao\n"
                        + "4 - Divisao\n"
                        + "5 - Sair");
                option = read.nextInt();
            } else if (option == 4) {
                System.out.println("Digite o primeiro numero");
                n1 = read.nextDouble();
                System.out.println("Digite o segundo numero");
                n2 = read.nextDouble();
                divide(n1, n2);
                System.out.println("Calculadora\n"
                        + "----------------------------------\n"
                        + "Digite sua operação\n"
                        + "1 - Soma\n"
                        + "2 - Subtracao\n"
                        + "3 - Multiplicacao\n"
                        + "4 - Divisao\n"
                        + "5 - Sair");
                option = read.nextInt();
            }
        }
    }
    static void soma (double x, double y){
        System.out.println("Resultado: " + (x+y));
    }
    static void subtrai (double x, double y){
        System.out.println("Resultado: " + (x-y));
    }
    static void multiplica (double x, double y){
        System.out.println("Resultado: " + (x*y));
    }
    static void divide (double x, double y){
        System.out.println("Resultado: " + (x/y));
    }
}