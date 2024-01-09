package JavaPackage;

import JavaPackage.Stu1.stu1;
import JavaPackage.Stu1.sumarray;
import JavaPackage.Stu2.stu2;
import java.util.Arrays;

public class abc1 {
    public static void main(String[] args) {
        stu1 ob1 = new stu1();
        stu2 ob2 = new stu2();

        int arr1[] = ob1.get1();
        System.out.println("arr1: " + Arrays.toString(arr1));

        int arr2[] = ob2.get2();
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
