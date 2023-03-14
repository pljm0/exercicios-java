import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        Scanner scanner = new Scanner(System.in);

        int pass = scanner.nextInt();

        while(pass != 2002) {
            System.out.println("Senha Inválida. Tente novamente.");
            pass = scanner.nextInt();

        }

        System.out.println("Senha correta.");

    }
}
