package nascimento.thalles.src.application;

import nascimento.thalles.src.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String largeArea;
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre com os lados do Triângulo X: ");
        x.setA(sc.nextDouble());
        x.setB(sc.nextDouble());
        x.setC(sc.nextDouble());

        System.out.println("Entre com os lados do Triângulo Y: ");
        y.setA(sc.nextDouble());
        y.setB(sc.nextDouble());
        y.setC(sc.nextDouble());

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        if (areaX > areaY){
            largeArea = "X";
        }
        else if (areaX < areaY){
            largeArea = "Y";
        }
        else{
            largeArea = "São do mesmo tamanho";
        }

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
        System.out.println("Maior área: " + largeArea);

        sc.close();

    }
}
