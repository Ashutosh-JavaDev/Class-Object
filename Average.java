import java.util.*;

class avg {
    float avg = 0, sum = 0;
    int arr[], size;

    void takingInput() {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void calculate() {
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        avg = sum / size;
        System.out.println("Average:    " + avg);
    }
}

public class Average {

}
