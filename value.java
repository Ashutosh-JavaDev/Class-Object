import java.util.*;

class aa2 {
    String Name;
    int Roll;
    double fee;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        Name = sc.nextLine();
        System.out.println("Enter Roll Number");
        Roll = sc.nextInt();
        System.out.println("Enter Fee");
        fee = sc.nextDouble();
        System.out.println("---------------------------------------");
    }

    void put() {
        System.out.println("Name:                            " + Name);
        System.out.println("Roll:                            " + Roll);
        System.out.println("Fee:                             " + fee);
        System.out.println("----------------------------------------");

    }
}

public class value {
    public static void main(String[] args) {
        aa2[] ob = new aa2[5];
        for (int i = 0; i < 5; i++) {
            ob[i] = new aa2();
        }
        System.out.println("Enter Student Details");
        for (int i = 0; i < 5; i++) {
            ob[i].get();
        }
        System.out.println("Student Details");
        for (int i = 0; i < 5; i++) {
            ob[i].put();
        }
    }
}
