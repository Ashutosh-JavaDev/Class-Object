package JavaPackage.Stu1;

import java.util.Scanner;

public class stu1 {
    public void get1() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the data in the Array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int put1() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the data in the Array");
        for(int i=0;i<5;i++){
            return arr[i];
        }
    }
}
