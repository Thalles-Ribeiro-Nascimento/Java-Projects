package nascimento.thalles.src.application;

import nascimento.thalles.src.util.AreaTriangle;

public class MainTriangleStatic {
    public static void main(String[] args) {

        double areaX = AreaTriangle.calculoArea(3, 4, 7);
        double areaY = AreaTriangle.calculoArea(6, 8, 12);
        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
//        System.out.println("Maior área: " + largeArea);


    }
}
