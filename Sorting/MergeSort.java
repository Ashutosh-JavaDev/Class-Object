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
        System.out.println("Array after Sort");
        for (k = 0; k < e; k++) {
            System.out.print(arr2[k] + " ");
        }
    }

}

public class MergeSort {
public static void main(String[]args){
    merge ob=new merge();
    int arr[]={7,8,1,2,5,9};
    ob.Merge(arr, 0, arr.length-1);

}
}
