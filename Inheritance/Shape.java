package Inheritance;

import java.util.Scanner;

class shape {
    float a, b;

    double getArea() {
        double area = a * b;
        return area;
    }
}

class rectangle extends shape {
    void getRect(float length, float breadth) {
        a = length;
        b = breadth;
        System.out.println("Area:   " + getArea());
    }

}

public class Shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle ob=new rectangle();
        System.out.println("Enter Length and Breadth of the Rectangle");
        ob.getRect(sc.nextFloat(),sc.nextFloat());
        ob.getArea();
    }
}
