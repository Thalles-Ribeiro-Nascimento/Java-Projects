package nascimento.thalles.src.entities;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
*/

public class Ex02_Employee {
    private String name;
    private double salary;
    private double tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double salaryLiquid(){
        return this.salary - this.tax;
    }

    public void incrementSalary(float perc){
        double incremento = (this.salary * perc) / 100;
        this.salary += incremento;
    }

    public String toString(){
        return String.format("Funcionário: %s%n" +
                "Salário Líquido: %.2f",
                this.getName(),
                this.salaryLiquid()
        );
    }
}
