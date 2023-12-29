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
        getWithdraw(withdraw);
        getDepo(deposite);
        System.out.println("Enter Withdraw Amount");
        float withAmount=sc.nextFloat();
        if(withAmount<=deposite){
            System.out.println("Amount Withdrawn");
        }
        else{
            System.out.println("Insufficent Balance");
        }
        float TotalBalance=deposite-withAmount;
    }
}
public class BankAccount {
    
}
