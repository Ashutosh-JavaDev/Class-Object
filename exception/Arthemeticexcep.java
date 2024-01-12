package exception;

import java.util.Scanner;

class excep {
    int a, b, c;

    void takea(int a) {
        this.a = a;
    }

    void takeb(int b) {
        this.b = b;
    }

    int puta() {
        return a;
    }

    int putb() {
        return b;
    }

    void disp() {
        try {
            c = a / b;
            System.out.println("Result:     " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

public class Arthemeticexcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        excep ob=new excep();
        System.out.println("Enter the value in a");
        ob.takea(sc.nextInt());
        System.out.println("Enter the VAlue in b");
        ob.takeb(sc.nextInt());
        ob.disp();
    }
}
