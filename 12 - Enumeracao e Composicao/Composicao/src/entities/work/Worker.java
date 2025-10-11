package entities.work;

import enums.work.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

//    Associação - Composição de objetos
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public boolean removeContract(HourContract contract){
        if (this.contracts.isEmpty()){
            return false;
        }
        this.contracts.remove(contract);
        return true;
    }

    public Double income(Integer month, Integer year){
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c : this.contracts){
            int c_year, c_month;

            cal.setTime(c.getDate());
            c_year = cal.get(Calendar.YEAR);
            c_month = 1 + cal.get(Calendar.MONTH);

            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }

        return sum;
    }

}
