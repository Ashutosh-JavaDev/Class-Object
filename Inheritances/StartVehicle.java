package Inheritances;
class vehicle{
    void engine(){
        System.out.println("Vehicle Start");
    }
}
public class StartVehicle {
   public static void main(String[] args) {
     vehicle ob=new vehicle();
    ob.engine();
   }
}
