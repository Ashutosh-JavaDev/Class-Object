package recursion;

class check {
    void evenodd(int arr[], int size) {
        if (size < 0) {
            System.out.println("");
            return;
        } else {
            if (arr[size - 1] % 2 == 0) {
                System.out.print(arr[size - 1] + " ");
                evenodd(arr, size - 1);
            } else {
                System.out.print(arr[size - 1] + " ");

                evenodd(arr, size - 2);
            }
        }
    }
}

public class EvenOddNumber {

}
