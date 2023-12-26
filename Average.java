import java.util.*;

class avg {
    int arr[];
    float sum = 0, a = 0;

    void takingInput(int size) {
        Scanner sc = new Scanner(System.in);
        arr = new int[size];
        System.out.println("Enter the Value in Array");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void cal(int size) {
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        a = sum / size;
        System.out.println("Average:    " + a);
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter the Number of  Object Wants to Create");
        int object = sc.nextInt();
        avg ob[] = new avg[object];

        for (int i = 0; i < object; i++) {
            ob[i] = new avg();
            ob[i].takingInput(size);
            System.out.println(i + 1 + " Answer");
            ob[i].cal(size);

        }
    }
}
