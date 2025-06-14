package nascimento.thalles.src.util;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
*/

public class CurrencyConverter {
//    Static e Final = Modificadores de Restrição
    private static final double IOF = 6.0;

    public static double get_IOF(){
        return IOF;
    }

    public static double convert(double dollar, double bought){
        double real = bought * dollar;
        return (real * (IOF/100)) + real;
    }

}
