package Inheritate;

import java.util.Scanner;

class employee {
    String name[], Address[], Jobtitle[];
    int Salary;

    void getDetail(String name[], String Address[], String Jobtitle[]) {
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
            System.out.println("--------------------------------------------------");
        }
        for(int i=0;i<Number;i++){
            System.out.println("__________________________________________________");
            System.out.println("Name:               "+name[i]);
            System.out.println("Address:            "+Address[i]);
            System.out.println("Degination:         "+Jobtitle[i]);
            System.out.println("__________________________________________________");
        }
    }

    String[] setname() {
        return name;
    }
    String[] setAddress(){
        return Address;
    }
    String[] setJobTitle(){
        return Jobtitle;
    }

    void GetSalary(int Salary) {
        this.Salary = Salary;
    }

    int setSalary() {
        return Salary;
    }

    float CalBonus() {
        float bonus = Salary * 8.33f / 100;
        return bonus;

    }
}

class Programmer extends employee {
    void getProgrammer() {
        getDetail(name, Address, Jobtitle);
    }
}
class Developer extends employee{
    void getDeveloper(){
        getDetail(name, Address, Jobtitle);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    }
}
