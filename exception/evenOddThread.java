package exception;

import java.util.Scanner;

class all {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];

}

class even extends all implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("even input: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Number");
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("Even Number: " + arr[i] + " ");
            }
        }

    }
}

// ODD
class odd extends all implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("odd input: ");

            arr[i] = sc.nextInt();
        }
        System.out.println("Odd Number");
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 10) {
                System.out.println("OddNumber:" + arr[i] + " ");
            }
        }
    }
}

public class evenOddThread {
    public static void main(String[] args) {
        even ob1 = new even();
        odd ob2 = new odd();
        Thread t1 = new Thread(ob1);
        t1.start();
        Thread t2 = new Thread(ob2);
        t2.start();
    }
}
