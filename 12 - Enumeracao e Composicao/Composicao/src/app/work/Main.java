package app.work;

import entities.work.Department;
import entities.work.HourContract;
import entities.work.Worker;
import enums.work.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//      Declarando Objetos e Variáveis
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nContract;
        Department department;
        Worker worker;
        HourContract hourContract;
        Date contractDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        department = new Department(sc.nextLine());

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        worker = new Worker(nameWorker, workerLevel, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        nContract = sc.nextInt();

        sc.nextLine();
        for (int i = 1; i <= nContract; i++) {
            System.out.printf("Enter contract #%d data:%n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            contractDate = dateFormat.parse(sc.nextLine());

            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            hourContract = new HourContract(contractDate, valueHour, hours);

            worker.addContract(hourContract);
            sc.nextLine();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.next();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: $%.2f%n", monthYear, worker.income(month, year));

        sc.close();

    }

}
