package entities;

public class Produto {
    private String nome;
    private double valor;
    private int quantity;

    public Produto(String nome, double valor, int quantity) {
        this.nome = nome;
        this.valor = valor;
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
