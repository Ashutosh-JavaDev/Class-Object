package JavaPackage.Stu1;
import java.util.Scanner;

public class creatingData {
    String Name;
    int age, roll;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name");
            Name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Roll");
            roll = sc.nextInt();
            System.out.println("Enter Age");
            age = sc.nextInt();
        }
    }

    // Getter methods to access the details
    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }
}
