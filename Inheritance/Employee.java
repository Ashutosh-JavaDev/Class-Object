package Inheritance;

import java.util.*;

class employee {
    String work;
    float salary;

    void getWork(String work) {
        this.work = work;
    }

    String setWork() {
        return work;
    }

    void getSalary(float salary) {
        this.salary = salary;
    }

    float setSalary() {
        return salary;
    }
}

class HrManager extends employee {
    void HrWork() {
        getWork(work);
        getSalary(salary);
    }

    void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of New Employee want to add in company");
        int number = sc.nextInt();
        sc.nextLine();
        String newEmployee[] = new String[number];
        float newEmployeeSalary[] = new float[number];
        System.out.println("Enter the Work Degination and Salary of New Employee");
        for (int i = 0; i < number; i++) {
            System.out.println("Work Degination");
            newEmployee[i] = sc.nextLine();
            System.out.println("Employee Salary");
            newEmployeeSalary[i] = sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("Old Employee Work Degination:       " + setWork());
        System.out.println("Old Employee Salary:       " + setSalary());
        System.out.println("_________________________________________________");
        System.out.println("New Employee Data");
        for (int i = 0; i < number; i++) {
            System.out.println("New Employee Work Degination:       " + newEmployee[i]);
            System.out.println("New Employeee Salary:           " + newEmployeeSalary[i]);
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HrManager ob=new HrManager();
        System.out.println("Enter Employee Work Degination");
        ob.getWork(sc.nextLine());
        System.out.println("Enter Employee Salary");
        ob.getSalary(sc.nextFloat());
        ob.addEmployee();
    }
}
