import java.util.*;

class Student {
    int rollNumber, phone;
    String address; // Move the declaration outside the methods

    void sam() {
        rollNumber = 101;
        phone = 707098772;
        address = "Lalpur"; // Set the value within the method
    }

    void samdisp() {
        sam();
        System.out.println("Roll Number:    " + rollNumber);
        System.out.println("Phone Number:    " + phone);
        System.out.println("Address:    " + address);
    }

    void john() {
        rollNumber = 102;
        phone = 875639823;
        address = "Ranchi"; // Set the value within the method
    }
      void Johndisp() {
        john();
        System.out.println("Roll Number:    " + rollNumber);
        System.out.println("Phone Number:    " + phone);
        System.out.println("Address:    " + address);
    }

}

public class TwoObject {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.samdisp();
        ob.Johndisp();
    }
}
