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
        return arr;
    }
}
class sumArray extends stu1{
    public int sum(){
       int arr[]= get1();
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}