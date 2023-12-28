package GetterSetter;

import java.util.*;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape ob = new shape();
        shape.Triangle ob1 = ob.new Triangle();
        shape.Rectangle ob2 = ob.new Rectangle();
        shape.Circle ob3 = ob.new Circle();
        // Rectangle
        System.out.println("Enter Length And Breadth of rectangle");
        ob2.getData(sc.nextFloat(), sc.nextFloat());
        ob2.disp();
        // Triangle
        System.out.println("Enter Base And Height of Triangle");
        ob1.getData(sc.nextFloat(), sc.nextFloat());
        ob1.disp();
        // Circle
        System.out.println("Enter Radius");
        ob3.getData(sc.nextFloat());
        ob3.disp();
    }
}
