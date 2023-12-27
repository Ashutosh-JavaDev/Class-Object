package GetterSetter;

import java.util.*;

public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        course ob = new course();
        System.out.println("Enter Student Name");
        ob.getName(sc.nextLine());
        System.out.println("Enter Grade");
        ob.getGrade(sc.nextLine().charAt(0));
        System.out.println("Enter Present Course Name");
        ob.getCourse(sc.nextLine());
        System.out.println("Name:               " + ob.setName());
        System.out.println("Grade:              " + ob.setGrade());
        System.out.println("Course:             " + ob.setCourse());
        System.out.println("Press1.to add Courses\nPress2.to remove Courses");

        ob.Courses();
    }
}
