package TryandCatch;

import java.util.Scanner;

class aa2 {
    void sumofArray() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter the Array in the Array");
        for (int i = 0; i < 6; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        for (int j = 0; j < 5; j++) {
            sum += arr[j];
        }
        System.out.println("Sum:    " + sum);
    }
}

public class SumofArray {
    public static void main(String[] args) {
        new aa2().sumofArray();
    }
}
