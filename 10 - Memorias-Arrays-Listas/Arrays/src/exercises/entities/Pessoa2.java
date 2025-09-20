package exercises.entities;

public record Pessoa2(String nome, int idade) {

    @Override
    public String toString() {
        return String.format("Nome: %s%n" +
                "Idade: %d%n", this.nome(), this.idade());
    }
}
