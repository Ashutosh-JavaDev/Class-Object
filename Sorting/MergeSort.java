package Sorting;

class merge {
    void Merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int i = 0, j = mid + 1, k = 0;
        int arr2[] = new int[e + 1];
        while (i < mid && j < e) {
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

    }

}

public class MergeSort {

}
