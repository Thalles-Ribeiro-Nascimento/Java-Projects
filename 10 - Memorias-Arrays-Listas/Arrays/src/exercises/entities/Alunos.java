package exercises.entities;

public record Alunos(String nome, double nota1, double nota2) {

    private static double MEDIA;

    public Alunos(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        MEDIA = 6.0;
    }

    public boolean media() {
        double mediaNotas = (this.nota1() + this.nota2()) / 2;

        if (mediaNotas >= MEDIA) {
            return true;
        } else {
            return false;
        }
    }

}
