import java.util.Scanner;
class complex{
    int a,b;
    int sum(){
        int c=a+b;
        return c;
    }
    int diff(){
        int c=a-b;
        return c;
    }
    int pro(){
        int c=a*b;
        return c;
    }
}
public class Complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of  a & b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
    }
}
