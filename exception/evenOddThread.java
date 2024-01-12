package exception;
import java.util.Scanner;
class even extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        try{
            System.out.println("Enter the value in the Array");
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Even Number");
            for(int i=0;i<10;i++){
                if(arr[i]%2==0){
                    System.out.print(arr[i]+" ");
                }
            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
// ODD
class odd extends Thread{
    public void run(){
        
    }
}
public class evenOddThread {
    public static void main(String[] args) {
        even ob1=new even();
        ob1.start();
    }
}
