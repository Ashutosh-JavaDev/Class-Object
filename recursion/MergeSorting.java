package recursion;
class mergeSort{
    void merging(int arr[],int s,int mid,int e){
        mid=s+(e-s)/2;
        int mergeArray[]=new int[e-s+1];
        int i=s,j=mid+1,k=0;
        while(i<=mid&& j<=e){
            if(arr[i]>=arr[j]){
                mergeArray[k]=arr[i];
                i++;
                k++;
            }
            else{
                mergeArray[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            mergeArray[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            mergeArray[k]=arr[j];
            j++;k++;
        }
        for(i=0,j=s;i<mergeArray.length;i++,j++){
            mergeArray[i]=arr[j];
        }

    }
}
public class MergeSorting {

}
