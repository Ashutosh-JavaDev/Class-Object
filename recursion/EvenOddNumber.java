package recursion;

class check {
    void evenodd(int arr[], int size) {
        if (size == 0) {
            System.out.println("");
            return;
        } else {
            evenodd(arr, size - 1);
            if (arr[size - 1] % 2 == 0) {
                System.out.print(arr[size - 1] + " ");
            }

        }
    }
}

public class EvenOddNumber {
    public static void main(String[] args) {
        check ob = new check();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ob.evenodd(arr, 10);
    }
}
