import java.util.*;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Total Subject");
        int size = sc.nextInt();
        aa6[] ob = new aa6[size];
        for (int i = 0; i < size; i++) {
            ob[i] = new aa6();
            ob[i].setSize(size);
        }
        System.out.println("Enter the Value in Array");
        for (int i = 0; i < size; i++) {
            ob[i].get();
        }
        System.out.println("Sum:");
        for (int i = 0; i < size; i++) {
            ob[i].put();
        }
        System.out.println("Display Sum:");
        for (int i = 0; i < size; i++) {
            ob[i].disp();
        }
    }
}
