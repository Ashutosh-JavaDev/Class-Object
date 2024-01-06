package recursion;

import java.util.Scanner;

class reverse {
    void revString(String str, int l) {
        if (l == 0) {
            return;
        } else {
            System.out.print(str.charAt(l - 1));
            revString(str, l - 1);
        }
    }
}

public class StringReverse {
    public static void main(String[] args) {
        reverse ob = new reverse();
        ob.revString("Ashutosh", "Ashutosh".length());
        System.out.println();
    }
}
