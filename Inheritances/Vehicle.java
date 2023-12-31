package Inheritances;
class  vehicle{
    String Drive(){
        String status="Reparing a Car";
        return status;
    }
}
class Car extends vehicle{
    void driven(){
        System.out.println(("Status:    "+Drive()));

    }
}
public class Vehicle {
   public static void main(String[] args) {
     Car ob=new Car();
    ob.driven();
   }
}
