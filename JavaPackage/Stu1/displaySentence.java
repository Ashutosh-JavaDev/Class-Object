package JavaPackage.Stu1;

import java.util.Scanner;

public class displaySentence {
    private String Name;

    public void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        Name = sc.nextLine();
    }

    public String getName() {
        return Name;
    }
}
