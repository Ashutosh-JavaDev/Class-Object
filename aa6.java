package ClassesObject;

import java.util.*;

class aa6 {
    int arr[], size, sum = 0;

    // Add a method to set the size of the array
    void setSize(int newSize) {
        size = newSize;
        arr = new int[size];
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void put() {
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
    }

    void disp() {
        System.out.println("Sum of 5 Number: " + sum);
    }

}
