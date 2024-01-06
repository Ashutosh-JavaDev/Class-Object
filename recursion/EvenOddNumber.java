package recursion;

class check {
    void evenodd(int arr[], int size) {
        if (size - 1 < 0) {
            System.out.println("");
            return;
        } else {
            if (arr[size - 1] % 2 == 0) {
                System.out.println("__________________________________________________");
                System.out.print(arr[size - 1] + " ");
                evenodd(arr, size - 1);
            } else {
                System.out.println("--------------------------------------------------");

                System.out.print(arr[size - 1] + " ");

                evenodd(arr, size - 2);
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
