package TryandCatch;

import java.util.Scanner;

class aa1 {
    int arr[] = new int[4];

    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array");
        for (int i = 0; i < 4; i++) {
            try {
                arr[3] = 12345;
                arr[i] = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        System.out.println("Array Index");
        for (int j = 0; j < 4; j++) {
            System.out.println("arr[" + j + "] = " + arr[j]);
        }
    }
}

public class FirstPRogram {
    public static void main(String[] args) {
        aa1 ob = new aa1();
        ob.disp();
    }
}