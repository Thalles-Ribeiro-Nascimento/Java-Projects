package exercises.entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (anualIncome >= 20000){
            if (healthExpenditures != null){
                return (anualIncome * 0.25) - (healthExpenditures * 0.5);
            }
            else{
                return anualIncome * 0.25;
            }
        }
        else{
            if (healthExpenditures != null){
                return (anualIncome * 0.15) - (healthExpenditures * 0.5);
            }
            else{
                return anualIncome * 0.15;
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), tax());
    }
}
