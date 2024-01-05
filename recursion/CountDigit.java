package recursion;

import java.util.Scanner;

class count {
    int count(int num) {
        if (num < 10) {
            return num;
        } else {
            int c = 0;
            int d = num % 10;
            c++;
            count(num / 10);
            return c;

        }
    }
}

public class CountDigit {
    public static void main(String[] args) {
        count Ram = new count();
        int result = Ram.count(12345);
        System.out.println("Answer:  " + result);
    }
}
