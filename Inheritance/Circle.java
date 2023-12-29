package Inheritance;

import java.util.Scanner;

class circle {
    double Radius;

    void getPerimeter() {
    }

    void getArea() {

    }
}

class shape extends circle {
    double Radius, Circumfrence, Area;

    void getRadius(double Radius) {
        this.Radius = Radius;
    }

    double setRadius() {
        return Radius;
    }

    @Override
    void getPerimeter() {
        Circumfrence = 2 * 3.14 * Radius;
    }

    double setPerimeter() {
        return Circumfrence;
    }

    @Override
    void getArea() {
        Area = 3.14 * Radius * Radius;
    }

    double setArea() {
        return Area;
    }
}

public class Circle {

}
