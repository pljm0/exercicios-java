import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Escolha a opcao desejada:" +
                           "\n1. Alcool" +
                           "\n2. Gasolina" +
                           "\n3. Diesel" +
                           "\n4. Fim    ");
        int option = scanner.nextInt();

        while(option != 0) {
            if(option == 1) {
                alcool++;

            }else if(option == 2) {
                gasolina++;

            }else if(option == 3) {
                diesel++;

            }else if(option == 4) {
                System.out.println("MUITO OBRIGADO!" +
                                   "\nAlcool: " + alcool +
                                   "\nGasolina: " + gasolina +
                                   "\nDiesel: " + diesel);
                System.exit(0);
            }else {
                System.out.println("Opcao invalida, tente novamente.");

            }

            System.out.println("Escolha a opcao desejada:" +
                               "\n1. Alcool" +
                               "\n2. Gasolina" +
                               "\n3. Diesel" +
                               "\n4. Fim    ");
            option = scanner.nextInt();
        }

    }
}
