package recursion;

import java.util.Scanner;

class Largest {
    int MaxElement(int i, int arr[], int max) {
        if (i == arr.length) {
            return arr[max];
        } else {
            if (arr[i] > arr[max]) {
                return MaxElement(i + 1, arr, i);
            } else {
                return MaxElement(i + 1, arr, max);
            }
        }
    }
}

public class LargestArray {
    public static void main(String[] args) {
        Largest ob = new Largest();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter element in array");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int result = ob.MaxElement(0, arr, 1);
        System.out.println("MAximum:    " + result);
    }
}
