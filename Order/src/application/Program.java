package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do cliente: ");
        System.out.println("Name: ");
        String clientName = scanner.nextLine();

        System.out.println("Email: ");
        String clientEmail = scanner.nextLine();

        System.out.println("Data de nascimento (DD/MM/YYYY): ");
        String clientBirth = scanner.nextLine();

        System.out.println("Digite os dados do pedido: ");
        System.out.println("Status: ");
        String status = scanner.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(clientName, clientEmail,
                LocalDate.parse(clientBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        System.out.println("Quantos itens para esse pedido? ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++) {
            scanner.nextLine();
            System.out.printf("Digite os dados do pedido #%d:", i);
            System.out.println("\nNome do produto: ");
            String productName = scanner.nextLine();

            System.out.println("Preco do produto: ");
            double productPrice = scanner.nextDouble();

            System.out.println("Quantidade: ");
            int productQuantity = scanner.nextInt();

            order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));

        }

        System.out.println("RESUMO DO PEDIDO: ");
        System.out.println("Horario do pedido: ");
        System.out.println(order.getMoment());
        System.out.println("Status do pedido: ");
        System.out.println(order.getStatus());
        System.out.println("Cliente: ");
        System.out.println(order.getClient().getName() + " " + order.getClient().getBirthDate() + " - "
                + order.getClient().getEmail());
        System.out.println("Itens do pedido: ");
        for(OrderItem o : order.getItems()) {
            System.out.printf("%s, $%.2f, Quantidade: %d, Subtotal: %.2f", o.getProduct().getName() + o.getPrice()
                    + o.getQuantity() + o.subTotal());
        }
        System.out.println("Valor total: ");
        System.out.printf("$%.2f", order.total());


    }

}
