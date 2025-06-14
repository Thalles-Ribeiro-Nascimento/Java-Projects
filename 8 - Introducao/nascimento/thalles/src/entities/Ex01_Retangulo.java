package nascimento.thalles.src.entities;

/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

Área: A = b * h, onde 'b' é a base e 'h' é a altura do retângulo.
Perímetro: P = 2 * (b + h).
Diagonal: d = √(b² + h²), onde 'b' é a base e 'h' é a altura, utilizando o teorema de Pitágoras.
* */

public class Ex01_Retangulo {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaRetangle(){
        return this.height * this.width;
    }

    public double perimeterRetangle(){
        return 2 * (this.width + this.height);
    }

    public double diagonalRetangle(){
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }

    public String toString(){
        return String.format(
                "Base: %.2f%n" +
                "Altura: %.2f%n" +
                "Área: %.2f%n" +
                "Perimetro: %.2f%n" +
                "Diagonal: %.2f",
                this.getWidth(),
                this.getHeight(),
                this.areaRetangle(),
                this.perimeterRetangle(),
                this.diagonalRetangle()
        );
    }
}
