import java.util.*;
class Triangle{
    float length=3,breadth=4,height=5;
    void area(){
        double ar=0.5*breadth*height;
        System.out.println("Area of Triangle:   "+ar);
    }
    void perimeter(){
        double peri=length+breadth+height;
        System.out.println("Perimeter:      "+peri);
    }
}
public class AreaandParameter {
   public static void main(String[]args){
    Triangle ob=new Triangle();
    ob.area();
    ob.perimeter();
   }
}
