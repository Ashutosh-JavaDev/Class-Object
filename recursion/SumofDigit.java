package recursion;
import java.util.Scanner;
class Sumofdig{
    int sumofdigit(int num){
        if(num<10){
            return num;
        }
        else{
            return(num%10)+sumofdigit(num/10);
        }
    }
}
public class SumofDigit {
    public static void main(String[] args) {
        Sumofdig Shree=new Sumofdig();
        int result=Shree.sumofdigit(67891);
        System.out.println("Answer: "+result);

    }
}
