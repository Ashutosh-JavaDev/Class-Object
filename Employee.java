import java.util.*;
class Emp{
    String Name,Address;
    int year;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        Name=sc.nextLine();
        System.out.println("Enter Address");
        Address=sc.nextLine();
        System.out.println("Enter the Year of Joining");
        year=sc.nextInt();
        System.out.println("------------------------------");
    }
    void disp(){
        System.out.println("------------------------------");
        System.out.println("Employee Name:      "+Name);
        System.out.println("Address:            "+Address);
        System.out.println("Year of Joining:    "+year);
    }
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Employee value  Want to Insert");
        int Insert=sc.nextInt();
        Emp ob[]=new Emp[Insert];
        System.out.println("Enter the  Details of the Employee");
        for(int i=0;i<Insert;i++){
            ob[i]=new Emp();
            ob[i].get();
        } 
        System.out.println("Employee Details");
        for(int i=0;i<Insert;i++){
            ob[i].disp();
        }
    }
}
