package JavaPackage.Stu1;

import java.util.Scanner;

public class displaySentence {
    String Name;
    public void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String Name=sc.nextLine();
    }
    public String getName(){
        return Name;
    }

}
