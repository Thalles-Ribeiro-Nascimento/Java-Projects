package app.order;

import entities.order.Client;
import entities.order.Order;
import entities.order.OrderItem;
import entities.order.Product;
import enums.order.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Order order;
        Client client;
        OrderItem item;
        Product product;
        int nItens;

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = simpleDateFormat.parse(sc.nextLine());

        client = new Client(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order: ");
        nItens = sc.nextInt();

        sc.nextLine();

        order = new Order(new Date(), orderStatus, client);

        for (int i = 0; i < nItens; i++) {
            System.out.printf("Enter #%d item data:%n", i + 1);
            System.out.print("Product Name: ");
            String nameProduct = sc.nextLine();

            System.out.print("Product Price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();

            product = new Product(nameProduct, priceProduct);
            item = new OrderItem(quantityProduct, product);
            order.addItem(item);

            sc.nextLine();
        }

        System.out.println(order);

        sc.close();

    }
}
