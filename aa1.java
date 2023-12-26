import java.util.*;

class aa1 {
    int a, b;

    void get(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the Value of A & B"));
        x = sc.nextInt();
        y = sc.nextInt();
        a = x;
        b = y;
    }

    void put() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    void disp() {
        System.out.println("Value of A after swap: " + a);
        System.out.println("Value  of B after Swap: " + b);
    }
}