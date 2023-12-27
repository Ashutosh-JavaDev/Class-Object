package GetterSetter;

import java.util.*;

class course {
    String Name, Course, arr[];
    char Grade;
    int Press;

    void getName(String Name) {
        this.Name = Name;
    }

    String setName() {
        return Name;
    }

    void getCourse(String Course) {
        this.Course = Course;
    }

    String setCourse() {
        return Course;
    }

    void getGrade(char Grade) {
        this.Grade = Grade;
    }

    char setGrade() {
        return Grade;
    }

    void Courses(int Press) {
        Scanner sc = new Scanner(System.in);
        this.Press = Press;
        switch (Press) {
            case 1:
                System.out.println("How Many New Subject Wants to Add");
                int number = sc.nextInt();
                sc.nextLine();
                arr = new String[number];
                System.out.println("Enter The name of the courses");
                for (int i = 0; i < number; i++) {
                    arr[i] = sc.nextLine();
                }
                System.out.println("New Details of Courses After Updated");
                System.out.println(setCourse());
                for (int i = 0; i < number; i++) {
                    System.out.println(arr[i]);
                }
                break;
            case 2:
             Course="";
             System.out.println("Course SucessFully Removed");
                break;
            default:
                System.out.println("Invalid Press");
        }
    }
}
