package Inheritance;

import java.util.Scanner;

class shape {
    float a, b;

    float getArea() {
        float area = a * b;
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

    }
}
