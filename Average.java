import java.util.*;
class avg{
    int arr[];
    float sum=0,a=0;
    void takingInput(int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size=sc.nextInt();
    }
    void cal(){
        takingInput(size);
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        
    }
}