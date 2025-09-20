package application;

import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Celular", 1850.00, 2);
        System.out.println(p1.getNome()); // output: Celular

        Produto p2 = new Produto("TV", 900.00, 0);
        System.out.println(p2.getNome()); // output: TV

//        p1 para de apontar (Referenciar) o objeto new Produto("Celular", 1850.00, 2) e passa a apontar para o mesmo que p2,
//        fazendo assim com que o Garbage collector limpe aquele espaço de memória Heap
        p1 = p2;

        System.out.println(p1.getNome()); // output: TV


    }

}
