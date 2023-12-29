package Inheritance;
import java.util.*;
class  bankaccount{
    float deposite,withdraw;
    void getDepo(float deposite){
        this.deposite=deposite;
    }
    float setDepo(){
        return deposite;
    }
    void getWithdraw(float withdraw){
        this.withdraw=withdraw;
    }
    float setWithdraw(){
        return withdraw;
    }
}
class savingAccount extends bankaccount{
    void takeWithdraw(){
        Scanner sc=new Scanner(System.in);
        getDepo(deposite);
        System.out.println("Current Bal:    "+setDepo());
        getWithdraw(withdraw);
        if(withdraw<=deposite){
            System.out.println("Amount Withdrawn");
        }
        else{
            System.out.println("Insufficent Balance");
        }
        float TotalBalance=deposite-withdraw;
        if(TotalBalance<100){
            System.out.println("Minimum Balance Hit");
        }
        else{
            System.out.println("Total Bal:  "+TotalBalance);
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        savingAccount ob=new savingAccount();
        System.out.println("Add Money in Your Account");
        ob.getDepo(sc.nextFloat());
        System.out.println("WithDraw Amount");
        ob.getWithdraw(sc.nextFloat());
        ob.takeWithdraw();
    }
}
