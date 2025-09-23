package exercises.entities;

public class Funcionario {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        this.salary = getSalary() * percentage + getSalary();

    }

    @Override
    public String toString() {
        return String.format("%d, " +
                "%s, " +
                "%.2f",
                getId(),
                getName(),
                getSalary());
    }
}
