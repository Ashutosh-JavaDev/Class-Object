package recursion;
class search{
    int khojo(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        else{
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                return s=mid+1;
            }
            else{
                return e=mid-1;
            }
        }
    }
}
public class BinarySearch {
    
}
