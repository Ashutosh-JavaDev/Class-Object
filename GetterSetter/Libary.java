package GetterSetter;
import java.util.*;
public class Libary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        libary ob=new libary();
        ob.getName();
        System.out.println("Press 1 to add new books\nPress 2 to remove books");
        int userChoice = sc.nextInt();
        ob.Lib(userChoice);
    }
}
