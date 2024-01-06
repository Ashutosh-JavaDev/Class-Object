package Sorting;

class merge {
    void Merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int i = s, j = mid, k = 0;
        int arr2[] = new int[e + 1];
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                arr2[k] = arr[i];
                i++;
                k++;
            } else {
                arr2[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < mid) {
            arr2[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            arr2[k] = arr[j];
            j++;
            k++;
        }
        System.out.println("Array after Sort");
        for (k = 0; k < arr2.length; k++) {
            arr[s + k] = arr2[k];
        }
        System.out.println();
    }

}

public class MergeSort {
    public static void main(String[] args) {
        merge ob = new merge();
        int arr[] = { 7, 8, 1, 2, 5, 9 };
        ob.Merge(arr, 0, arr.length - 1);
        System.out.println("Array after Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
