package nascimento.thalles.src.application;

/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado
* */

import nascimento.thalles.src.entities.Ex01_Retangulo;

import java.util.Locale;

public class Main_Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Ex01_Retangulo retangulo = new Ex01_Retangulo();
        retangulo.setWidth(3.00);
        retangulo.setHeight(4.00);

        System.out.println(retangulo);

    }
}
