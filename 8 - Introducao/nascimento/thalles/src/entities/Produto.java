package nascimento.thalles.src.entities;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double valorTotalEmEstoque(){
        return this.price * this.quantity;
    }

    public void addProduto(int quantidade){
        this.quantity += quantidade;
        // this.quantity = this.quantity + quantidade;
    }

    public void rmProduto(int quantidade){
        this.quantity -= quantidade;
        // this.quantity = this.quantity - quantidade;
    }

    @Override
    public String toString(){
        return String.format("%nProduto: %s%n" +
                        "Preço: $%.2f%n" +
                        "Quantidade: %d%n" +
                        "Valor Total em estoque: $%.2f%n",
                this.getName(),
                this.getPrice(),
                this.getQuantity(),
                this.valorTotalEmEstoque()
        );

    }

}
