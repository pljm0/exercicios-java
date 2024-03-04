package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos empregados vao ser registrados? ");
        int n = scanner.nextInt();

        for(int i=0;i<n;i++) {
            System.out.printf("\nEmpregado #%d", i+1);
            System.out.println("\nId: ");
            int id = scanner.nextInt();
            while (idDuplicate(list, id)) {
                System.out.println("ID duplicado! Tente novamente.");
                System.out.println("\nId: ");
                id = scanner.nextInt();

            }
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Salary: ");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);

        }

        System.out.println("Digite o ID do empregado que ira receber aumento de salario: ");
        int idverify = scanner.nextInt();
        Integer index = idCheck(list, idverify);

        if(index == null) {
            System.out.println("Esse ID nao existe!");

        }else {
            System.out.println("Digite a porcentagem: ");
            double percentage = scanner.nextDouble();

            list.get(index).increaseSalary(percentage);

        }

        System.out.println("\nLista de empregados: ");
        for(Employee emp : list) {
            System.out.println(emp);

        }

    }

    public static Integer idCheck(List<Employee> list, int id) {
        for(int i=0;i<list.size();i++) {
            if(id == list.get(i).getId()) {
                return i;

            }
        }
        return null;
    }

    public static Boolean idDuplicate(List<Employee> list, int id) {
        for(int i=0;i<list.size();i++) {
            if(id == list.get(i).getId()) {
                return true;

            }
        }
        return false;
    }

}
