package recursion;

import java.util.Scanner;

class count {
    int count(int num, int c) {
        if (num == 0) {
            return c;
        } else {
            int d = num % 10;
            return count(num / 10, c + 1);

        }
    }
}

public class CountDigit {
    public static void main(String[] args) {
        count Ram = new count();
        int result = Ram.count(12345, 0);
        System.out.println("Answer:  " + result);
    }
}
