package Inheritate;

import java.util.Scanner;

class employee {
    String name[], Address[], Jobtitle[];
    int Salary;

    void getDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Number of Employee detail Want to add in Data");
        int Number = sc.nextInt();
        sc.nextLine();
        name = new String[Number];
        Address = new String[Number];
        Jobtitle = new String[Number];
        System.out.println("Enter Employee Datail");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < Number; i++) {
            System.out.println("Enter Employee Name");
            name[i] = sc.nextLine();
            System.out.println("Address of Employee");
            Address[i] = sc.nextLine();
            System.out.println("Job Degination");
            Jobtitle[i] = sc.nextLine();
        }
    }

    void GetSalary(int Salary) {
        this.Salary = Salary;
    }

    int setSalary() {
        return Salary;
    }

    float CalBonus() {
        float bonus = Salary*8.33f/100;
        return bonus;

    }
}

public class Employee {

}
