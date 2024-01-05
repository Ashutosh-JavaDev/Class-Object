package recursion;
import java.lang.reflect.Array;
import java.util.Scanner;
class ArrayElement{
    void dispArray(int i,int arr[]){
        if(i==10){
            System.out.println("");
            return;
        }
        else{
            System.out.println("arr["+i+"] = "+arr[i]);
            dispArray(i+1, arr);
        }
    }
}
public class PrintAraayElement {
    public static void main(String[] args) {
        Scanner Ayodhya=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the Elment in Array");
        for(int i=0;i<10;i++){
            arr[i]=Ayodhya.nextInt();
        }
        ArrayElement Ram=new ArrayElement();
        Ram.dispArray(0, arr);
    }
}
