package GetterSetter;
import java.util.*;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        trafficlight ob=new trafficlight();
        System.out.println("Insert Color");
        ob.getcolor(sc.nextLine());
        System.out.println("Insert New Color");
        ob.getNewcolor(sc.nextLine());
        System.out.println("Original Color:     "+ob.setColor());
        System.out.println("New Color:          "+ob.setNewColor());
    }
}
