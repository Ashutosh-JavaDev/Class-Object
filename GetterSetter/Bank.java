package GetterSetter;
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        aa3 ob=new aa3();
        System.out.println("Enter Your Name");
        ob.getName(sc.nextLine());
        System.out.println("Enter Year of Joining");
        ob.getYear(sc.nextInt());
        System.out.println("Enter Amount");
        ob.getAmount(sc.nextDouble());
        System.out.println("Press.1 to Withdraw Money\nPress2. to Add Money");
        ob.getPress(sc.nextInt());
    }
}
