package JavaPackage;
import JavaPackage.Stu1.creatingData;
import JavaPackage.Stu2.PuttingData;
public class DisplayData {
    public static void main(String[] args) {
        creatingData ob3=new creatingData();
        PuttingData ob4=new PuttingData();
        System.out.println("Enter Student Detail");
        ob3.takeInput();
        System.out.println("-------------------------------");
        System.out.println("Student Details:");
         ob4.disp();
    }
}
