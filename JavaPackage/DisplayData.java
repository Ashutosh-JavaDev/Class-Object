package JavaPackage;
import JavaPackage.Stu1.createData;
import JavaPackage.Stu2.putData;
public class DisplayData {
    public static void main(String[] args) {
        createData ob3=new createData();
        putData ob4=new putData();
        System.out.println("Enter Student Detail");
        ob3.takeInput();
         // Display data
         System.out.println("---------------------------------------------");
         System.out.println("Student details");
         ob4.Name = ob3.Name;
         ob4.age = ob3.age;
         ob4.roll = ob3.roll;
         ob4.disp();
    }
}
