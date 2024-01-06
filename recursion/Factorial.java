package recursion;
import java.util.Scanner;
class fact{
    int fact(int i){
        if(i==1||i==0){
            return i;
        }
        else{
            return i*fact(i-1);
        }
    }
}
public class Factorial {
    public static void main(String[] args) {
        fact ob=new fact();
        int result=ob.fact(5);
        System.out.println("Result: "+result);
    }
}
