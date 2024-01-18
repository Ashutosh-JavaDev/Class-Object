package JavaPackage;

import JavaPackage.Stu1.creatingData;
public class DisplayData {
    public static void main(String[] args) {
        creatingData ob3 = new creatingData();
        System.out.println("Enter Student Detail");
        ob3.takeInput();
        ob3.disp();
    }
}
