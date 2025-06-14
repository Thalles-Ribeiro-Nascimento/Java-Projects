package nascimento.thalles.src.application;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/

import nascimento.thalles.src.entities.Ex02_Employee;
import java.util.Locale;

public class Main_Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Ex02_Employee employee = new Ex02_Employee();
        employee.setName("Thalles Nascimento");
        employee.setSalary(6000.00);
        employee.setTax(1000.00);

        System.out.println(employee);

        employee.incrementSalary(10.0f);

        System.out.println(employee);

    }

}
