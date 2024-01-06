package Sorting;

class merge {
    void Merge(int arr[], int s,int mid, int e) {
         mid = s + (e - s) / 2;
        int i = s, j = mid+1, k = 0;
        int arr2[] = new int[e -s+ 1];
        while (i <= mid && j <= e) {
            if (arr[i] >     arr[j]) {
                arr2[k] = arr[i];
                i++;
                k++;
            } else {
                arr2[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            arr2[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            arr2[k] = arr[j];
            j++;
            k++;
        }
        for (k = 0; k < arr2.length; k++) {
            arr[s + k] = arr2[k];
        }
    }

    void mergeSort(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid + 1, e);
            Merge(arr, s, mid, e);
        }
    }

}

public class MergeSort {
    public static void main(String[] args) {
        merge ob = new merge();
        int arr[] = { 7, 8, 1, 2, 5, 9 };
        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array after Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
