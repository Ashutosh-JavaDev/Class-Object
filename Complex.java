import java.util.Scanner;
class complex{
    int a,b;
    long sum(){
        long c=a+b;
        return c;
    }
    long diff(){
        long c=a-b;
        return c;
    }
    long pro(){
        long c=a*b;
        return c;
    }
}
public class Complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of  a & b");
        int FirstNumber=sc.nextInt();
        int SecondNumber=sc.nextInt();
        complex ob=new complex();
        ob.a=FirstNumber;
        ob.b=SecondNumber;
        long add=ob.sum();
        System.out.println("Sum of Two Number:  "+add);
        long sub=ob.diff();
        System.out.println("Difference of  Two Number   :"+sub);
        long product=ob.pro();
        System.out.println("Product of Two Number:  "+product);

    }
}
