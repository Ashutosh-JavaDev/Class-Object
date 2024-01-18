package JavaPackage.Stu1;
import java.util.Scanner;
class createData{
    String Name;
    int age,roll;
    void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        Name=sc.nextLine();
        System.out.println("Enter Roll");
        roll=sc.nextInt();
        System.out.println("Enter Age");
        age=sc.nextInt();
    }
}
public class creatingData {
    public static void main(String[] args) {
        createData ob[]=new createData[5];
        System.out.println("Enter 5 Student Detail");
        for(int i=0;i<5;i++){
            ob[i].takeInput();
        }

    }
}
