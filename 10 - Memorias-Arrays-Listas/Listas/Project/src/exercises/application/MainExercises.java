package exercises.application;

import exercises.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainExercises {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario employee;
        List<Funcionario> listEmployees = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionário #%d%n", i + 1);

            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasId(listEmployees, id)) {
                System.out.println("Funcionário já existe!");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            employee = new Funcionario(id, name, salary);
            listEmployees.add(employee);
        }

        System.out.print("Digite o ID do funcionário que deseja aumentar o salário: ");
        int id = sc.nextInt();

        Funcionario resultId = listEmployees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (resultId == null){
            System.out.println("Funcionário não existe");
        }
        else{
            System.out.print("Qual a porcentagem de aumento: ");
            double percentual = sc.nextDouble() / 100;

            resultId.increaseSalary(percentual);
        }

        System.out.println();
        System.out.println("Lista dos funcionários: ");
        for (Funcionario funcionarios : listEmployees){
            System.out.println(funcionarios);
        }

        sc.close();

    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }


}
