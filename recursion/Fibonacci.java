package recursion;
import java.util.Scanner;
class fibo{
    void Disp(int a,int b,int n){
        if(n>=8){
            System.out.println("");
            return;
        }
        else{
            int c=a+b;
            System.out.print(c+" ");
            Disp(b, c, n+1);
        }
    }
}
public class Fibonacci {
    public static void main(String[]args){
        fibo ob=new fibo();
        System.out.print("0 ");
        System.out.print("1 ");
        ob.Disp(0, 1, 2);
    }
}
