package nascimento.thalles.src.application;

import nascimento.thalles.src.util.ProblemaEstatico;

import java.util.Locale;
import java.util.Scanner;

public class MainProblemaEstatico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o Raio: ");
        double radius = sc.nextDouble();

        double circum = ProblemaEstatico.calculaCircum(radius);
        double volume = ProblemaEstatico.calculoVolume(radius);
        double pi = ProblemaEstatico.PI;

        System.out.printf("Raio: %.2f%n" +
                "Circunferência: %.2f%n" +
                "Volume: %.2f%n" +
                "PI: %.2f",
                radius,
                circum,
                volume,
                pi
        );


        sc.close();
    }

}
