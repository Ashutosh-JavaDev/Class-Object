package Inheritate;

import java.util.Scanner;

class employee {
    String name[], Address[], Jobtitle[];
    int Salary[];

    void InsertArray(int Number) {
        name = new String[Number];
        Address = new String[Number];
        Jobtitle = new String[Number];
        Salary = new int[Number];
    }

    void getDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Number of Employee detail Want to add in Data");
        int Number = sc.nextInt();
        sc.nextLine();
        InsertArray(Number);
        System.out.println("Enter Employee Datail");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < Number; i++) {
            System.out.println("Enter Employee Name");
            name[i] = sc.nextLine();
            System.out.println("Address of Employee");
            Address[i] = sc.nextLine();
            System.out.println("Job Degination");
            Jobtitle[i] = sc.nextLine();
            System.out.println("Salary Of Employee");
            Salary[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------------------------");
        }
        dispDetail();
    }

    void dispDetail() {
        for (int i = 0; i < name.length; i++) {
            System.out.println("__________________________________________________");
            System.out.println("Name:               " + name[i]);
            System.out.println("Address:            " + Address[i]);
            System.out.println("Degination:         " + Jobtitle[i]);
            System.out.println("Salary:             " + Salary[i]);
            System.out.println("Bonus:              " + CalBonus(Salary[i]));
            System.out.println("__________________________________________________");
        }
    }
    
    float CalBonus(int Salary) {
        float bonus = Salary * 8.33f / 100;
        return bonus;

    }
}

class Programmer extends employee {
    void getProgrammer() {
        getDetail();
    }
}

class Developer extends employee {
    void getDeveloper() {
        getDetail();
    }
}

public class worker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Programmer ob1=new Programmer();
        Developer ob2=new Developer();
        System.out.println("Enter Programmer Detail");
        ob1.getProgrammer();
        System.out.println("Enter Developer Detail");
        ob2.getDeveloper();
    }
}
