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

        for (int i = 0; i < number; i++) {

        }
    }
}

public class Employee {

}
