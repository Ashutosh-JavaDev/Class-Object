package JavaPackage.Stu2;
import JavaPackage.Stu1.creatingData;

public class PuttingData {
    public void disp(creatingData data) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name:   " + data.getName());
            System.out.println("Age:    " + data.getAge());
            System.out.println("Roll:   " + data.getRoll());
        }
    }
}
