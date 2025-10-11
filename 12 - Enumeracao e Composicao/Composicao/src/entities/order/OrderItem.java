package entities.order;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal (){
        return this.product.getPrice() * this.quantity;
    }

    @Override
    public String toString(){
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n",
                this.product.getName(), this.product.getPrice(), this.getQuantity(), this.subTotal());
    }
}
