import br.com.teste.User;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = "0";
        String loginverify;
        String password = "0";
        String passwordverify;
        String verifypass;
        String verifypass2;
        int option;

        System.out.println("---------------- \n" +
                           "Escolha uma opcao: \n" +
                           "1 - Logar \n" +
                           "2 - Criar uma conta \n" +
                           "3 - Sair");
        option = scanner.nextInt();
        scanner.nextLine();

        while(option != 3) {
            if(option == 1) {
                System.out.println("Usuario: ");
                loginverify = scanner.nextLine();
                loginverify = loginverify.trim();
                loginverify = loginverify.toLowerCase();
                System.out.println("Senha: ");
                passwordverify = scanner.nextLine();
                passwordverify = passwordverify.trim();
                passwordverify = passwordverify.toLowerCase();
                if(loginverify.equals(login) && passwordverify.equals(password)) {
                    System.out.println("Bem-vindo!");
                    System.exit(0);
                }else {
                    System.out.println("Usuario ou senha incorreto. Tente novamente!");
                    System.out.println("---------------- \n" +
                                       "Escolha uma opcao: \n" +
                                       "1 - Logar \n" +
                                       "2 - Criar uma conta \n" +
                                       "3 - Sair");
                    option = scanner.nextInt();
                    scanner.nextLine();
                }
            }else if(option == 2) {
                System.out.println("Digite seu nome de usuario: ");
                loginverify = scanner.nextLine();
                loginverify = loginverify.trim();
                loginverify = loginverify.toLowerCase();
                System.out.println("Digite sua senha: ");
                verifypass = scanner.nextLine();
                verifypass = verifypass.trim();
                verifypass = verifypass.toLowerCase();
                System.out.println("Repita a senha: ");
                verifypass2 = scanner.nextLine();
                verifypass2 = verifypass2.trim();
                verifypass2 = verifypass2.toLowerCase();
                if(verifypass.equals(verifypass2)) {
                    login = loginverify;
                    password = verifypass;
                    System.out.println("Sucesso!");
                    System.out.println("---------------- \n" +
                                       "Escolha uma opcao: \n" +
                                       "1 - Logar \n" +
                                       "2 - Criar uma conta \n" +
                                       "3 - Sair");
                    option = scanner.nextInt();
                    scanner.nextLine();
                }else {
                    while(!verifypass.equals(verifypass2)) {
                        System.out.println("Senhas incorretas. Tente novamente!");
                        System.out.println("Digite sua senha: ");
                        verifypass = scanner.nextLine();
                        System.out.println("Repita a senha: ");
                        verifypass2 = scanner.nextLine();
                    }
                    if (verifypass.equals(verifypass2)) {
                        login = loginverify;
                        password = verifypass;
                        System.out.println("Sucesso!");
                        System.out.println("---------------- \n" +
                                "Escolha uma opcao: \n" +
                                "1 - Logar \n" +
                                "2 - Criar uma conta \n" +
                                "3 - Sair");
                        option = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
            }else {
                System.out.println("Opcao invalida, tente novamente!");
                System.out.println("---------------- \n" +
                                   "Escolha uma opcao: \n" +
                                   "1 - Logar \n" +
                                   "2 - Criar uma conta \n" +
                                   "3 - Sair");
                option = scanner.nextInt();
                scanner.nextLine();
            }
        }


    }

}
