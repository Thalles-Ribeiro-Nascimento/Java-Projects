package exercises.entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        if (numberOfEmployees > 10){
            return anualIncome * 0.14;
        }
        return anualIncome * 0.16;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), tax());
    }
}
