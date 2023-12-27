package GetterSetter;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        employee ob=new employee();
        System.out.println("Enter Employee Name");
        ob.getName(sc.nextLine());
        System.out.println("Enter Your Salary");
        ob.getSalary(sc.nextInt());
        System.out.println("Enter Joining year");
        ob.getYear(sc.nextInt());
        ob.check();
    }
}
