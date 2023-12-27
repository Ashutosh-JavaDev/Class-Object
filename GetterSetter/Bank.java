package GetterSetter;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank ob = new bank();
        System.out.println("Enter Your Name");
        ob.getName(sc.nextLine());
        System.out.println("Enter Year of Joining");
        ob.getYear(sc.nextInt());
        System.out.println("Enter Amount");
        ob.getAmount(sc.nextDouble());
        System.out.println("Press.1 to Withdraw Money\nPress2. to Add Money");
        ob.getPress(sc.nextInt());
        System.out.println("Name:                   " + ob.setName());
        System.out.println("Year Of Joining:        " + ob.setYear());
        System.out.println("Original Amount:        " + ob.setAmount());
        ob.check();

    }
}
