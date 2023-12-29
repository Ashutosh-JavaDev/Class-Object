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
    double Radius;

    void getRadius(double Radius) {
        this.Radius = Radius;
    }

    double setRadius() {
        return Radius;
    }

    @Override
    void getPerimeter() {

    }
}

public class Circle {

}
