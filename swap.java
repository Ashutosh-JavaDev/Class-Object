import java.util.*;

class aa1 {
    int a, b;

    void get(int x, int y) {

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

public class swap {
    public static void main(String[] args) {
        aa1 ob = new aa1();
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the Value of A & B"));
        int x = sc.nextInt();
        int y = sc.nextInt();
        ob.get(x, y);
        ob.put();
        ob.disp();
    }
}
