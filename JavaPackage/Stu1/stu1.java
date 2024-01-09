package JavaPackage.Stu1;

import java.util.Scanner;

public class stu1 {
    public int[] get1() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the data in Stu1 Array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Data Display");
        int result = sum1(arr);
        System.out.println("Sum of Stu1 :" + result);
        return arr;

    }

    public int sum1(int arr[]) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}