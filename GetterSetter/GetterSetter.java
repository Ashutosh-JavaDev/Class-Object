package GetterSetter;
import java.util.*;
public class GetterSetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        getSet ob=new getSet();
        System.out.println("Enter Passenger Name");
        ob.getName(sc.nextLine());
        System.out.println("Enter Age");
        ob.getAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Gender");
        ob.getGender(sc.nextLine().charAt(0));
        System.out.println("Enter Base Fare");
        ob.getFare(sc.nextDouble());
        System.out.println("Name:           "+ob.setName());
        System.out.println("Age:            "+ob.setAge());
        System.out.println("Gender:         "+ob.setGender());
        System.out.println("Base Fare:      "+ob.setFare());
        System.out.println("Discount:       "+ob.cal());
        System.out.println("Net Fare:       "+(ob.setFare()-ob.cal()));
    }   
}
