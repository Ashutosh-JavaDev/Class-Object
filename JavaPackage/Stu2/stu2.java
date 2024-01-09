package JavaPackage.Stu2;

import java.util.Scanner;

public class stu2 {
    public int[] get2() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the data in Stu2 Array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int result=sum2();
        System.out.println("Sum of  Stu2:   "+result);
        System.out.println("Data Display");
        return arr;
    }

    public int sum2() {
        int arr[] = get2();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}