package entities.order;

import enums.order.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat SIMPLE_MOMENT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat SIMPLE_BIRTHDAY = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> listItens = new ArrayList<>();

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment(){
        return moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getListItens() {
        return listItens;
    }

    public void setOrderStatus (OrderStatus status){
        this.orderStatus = status;
    }

    public void addItem (OrderItem item){
        this.listItens.add(item);
    }

    public boolean removeItem (OrderItem item){
        if (this.listItens.isEmpty()){
            return false;

        }else {
            this.listItens.remove(item);
            return true;

        }
    }

    public Double total(){
        double sum = 0.0;

        for (OrderItem item : listItens){
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ");
        stringBuilder.append(SIMPLE_MOMENT.format(getMoment())).append("\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(getOrderStatus()).append("\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(getClient().getName()).append(" (");
        stringBuilder.append(SIMPLE_BIRTHDAY.format(getClient().getBirthday())).append(") - ");
        stringBuilder.append(getClient().getEmail()).append("\n");
        stringBuilder.append("Order items:" + "\n");
        for (OrderItem item : listItens){
            stringBuilder.append(item);

        }

        stringBuilder.append("Total Price: $");
        stringBuilder.append(total());

        return stringBuilder.toString();
    }

}
