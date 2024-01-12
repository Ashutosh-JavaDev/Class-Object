package exception;
import java.util.Scanner;
class detail{
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String Name=sc.nextLine();
        System.out.println("Enter Age");
        int age=sc.nextInt();
      try{
       if(age>0){
        System.out.println("Age:    "+age);
       }
      }
      catch(IllegalArgumentException e){
        System.out.println(e);
      }
    }
}
public class ageException {
    public static void main(String[]args){
        detail ob=new detail();
        ob.get();
    }
}
