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
                return khojo(arr, target, mid+1, e);
            }
            else{
                return khojo(arr, target, s, mid-1);
            }
        }
    }
}
public class BinarySearch {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,20};
        search ob=new search();
        int result=ob.khojo(arr, 5, 0, arr.length-1);
        System.out.println("Answer: "+result);
    }
}
