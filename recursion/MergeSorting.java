package recursion;

class mergeSort {
    void merging(int arr[], int s, int mid, int e, int[] mergeArray) {
        mid = s + (e - s) / 2;
        int i = s, j = mid + 1, k = 0;
        while (i <= mid && j <= e) {
            if (arr[i] > arr[j]) {
                mergeArray[k++] = arr[i++];
            } else {
                mergeArray[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            mergeArray[k++] = arr[i++];

        }
        while (j <= e) {
            mergeArray[k++] = arr[j++];
            // j++;k++;
        }
        for (i = 0, j = s; i < k; i++, j++) {
            arr[j] = mergeArray[i];
        }

    }

    void merged(int arr[], int s, int e, int[] mergeArray) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            merged(arr, s, mid, mergeArray);
            merged(arr, mid + 1, e, mergeArray);
            merging(arr, s, mid, e, mergeArray);
        }
    }
}

public class MergeSorting {
    public static void main(String[] args) {
        mergeSort ob = new mergeSort();
        int arr[] = { 3, 1, 5, 2, 64, 23, 0, 89 };
        int mergeArray[] = new int[arr.length];
        ob.merged(arr, 0, arr.length - 1, mergeArray);
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
