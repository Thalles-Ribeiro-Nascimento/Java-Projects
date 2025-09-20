package nascimento.thalles.src.nopoo;

import java.util.Locale;
import java.util.Scanner;

public class NoPoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String largeArea;

        System.out.println("Entre com as medidas do Triângulo X");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();

        System.out.println("Entre com as medidas do Triângulo Y");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();

        double areaX = calculoArea(xA, xB, xC);
        double areaY = calculoArea(yA, yB, yC);


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

    public static double calculoArea(double la, double lb, double lc){
        double p = (la + lb + lc) / 2;
        return Math.sqrt(p * (p - la) * (p - lb) * (p - lc));
    }
}
