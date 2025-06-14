package nascimento.thalles.src.util;

public class ProblemaEstatico {
    public static final double PI = 3.14;

    public static double calculaCircum(double raio){
        return 2 * PI * raio;
    }

    public static double calculoVolume(double raio){
        return (4.0 / 3) * PI * Math.pow(raio, 3);
    }

    public static double calculoAreaTriangule(double a, double b, double c){
        double p = (a + b + c)/ 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double areaRetangle(double base, double height){
        return height * base;
    }

    public static double perimeterRetangle(double base, double height){
        return 2 * (base + height);
    }

    public static double diagonalRetangle(double base, double height){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
