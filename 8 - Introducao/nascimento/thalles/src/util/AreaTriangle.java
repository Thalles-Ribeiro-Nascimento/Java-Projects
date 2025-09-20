package nascimento.thalles.src.util;

// Classe utilitária
public class AreaTriangle {

    public static double calculoArea(double a, double b, double c){
        double p = (a + b + c)/ 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
