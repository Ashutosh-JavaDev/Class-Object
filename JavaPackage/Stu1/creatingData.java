package JavaPackage.Stu1;
import java.util.Scanner;

public class creatingData {
    String[] names;
    int[] ages, rolls;
    int numberOfStudents;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numberOfStudents = sc.nextInt();

        names = new String[numberOfStudents];
        ages = new int[numberOfStudents];
        rolls = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            sc.nextLine(); // Consume the newline character

            System.out.println("Enter Name for student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Enter Roll for student " + (i + 1) + ": ");
            rolls[i] = sc.nextInt();

            System.out.println("Enter Age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
    }

    public void disp() {
        System.out.println("Students Details:   ");
        System.out.println("------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Name:   " + names[i]);
            System.out.println("Age:    " + ages[i]);
            System.out.println("Roll:   " + rolls[i]);
            System.out.println("------------------------------");
        }
    }
}
