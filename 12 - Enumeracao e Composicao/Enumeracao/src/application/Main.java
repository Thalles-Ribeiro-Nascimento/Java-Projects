package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

        System.out.println(order);

        OrderStatus status1 = OrderStatus.ENTREGUE;

        OrderStatus status2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(status1);
        System.out.println(status2);

    }
}
