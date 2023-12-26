import java.util.*;
class Area{
    double returnArea(float length, float breadth){
        double area=length*breadth;
        return area;
    }
    double returnperi(float length,float breadth){
        double perimeter=2*(length+breadth);
        return perimeter;
    } 
}
public class RectangleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of rectangle");
        float length=sc.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle");
        float breadth=sc.nextFloat();
        Area ob=new Area();
       double are= ob.returnArea(length, breadth);
        System.out.println("Area Of Rectangle:  "+are);
        double per=ob.returnperi(length, breadth);
        System.out.println("Perimeter of Rectangle:     "+per);
    }
}
