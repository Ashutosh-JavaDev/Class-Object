package GetterSetter;

import java.util.Scanner;

class person {
    int age;
    String name;

    void disp(String name) {
        this.name = name;
    }

    String putNAme() {
        return name;
    }

    void dispage(int age) {
        this.age = age;
    }

    int putage() {
        return age;
    }
}

public class Person {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        person ob=new person();
        System.out.println("Enter Name");
        ob.disp(sc.nextLine());
        System.out.println("Enter Age");
        ob.dispage(sc.nextInt());
        System.out.println("Name:   "+ob.putNAme());
        System.out.println("Age:    "+ob.putage());

    }
}
