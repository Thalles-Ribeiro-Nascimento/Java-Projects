package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainLista {
    public static void main(String[] args) {
//        ArrayList facilita a leitura dos itens dentro da Lista - Mistura vetor com Lista
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));


        System.out.println("------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
