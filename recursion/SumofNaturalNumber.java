package recursion;

import java.util.Scanner;

class findSum {
    int sumofOutput(int i) {
        if (i > 10) {
            return 0;
        } else {
            return i + sumofOutput(i + 1);
        }
    }
}

public class SumofNaturalNumber {

}
