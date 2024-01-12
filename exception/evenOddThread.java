package exception;
import java.util.Scanner;
class all{
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];

}
class even extends all implements Runnable{
    public void run(){
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
class odd extends all implements Runnable{
    public void run(){
        try{
            System.out.println("Enter the Value for Printing odd Number");
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Odd Number");
            for(int i=0;i<10;i++){
                if(arr[i]%2==0 && arr[i]>10){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}
public class evenOddThread {
    public static void main(String[] args) {
        even ob1=new even();
       Thread t1=new Thread(ob1);
       t1.start();
    }
}
