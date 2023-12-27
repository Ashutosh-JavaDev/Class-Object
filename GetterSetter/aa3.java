package GetterSetter;

import java.util.*;

class aa3 {
    String Name;
    int year;
    Double Amount, Del, Add;
    int press;

    void getName(String Name) {
        this.Name = Name;
    }

    String setName() {
        return Name;
    }

    void getYear(int year) {
        this.year = year;
    }

    int setYear() {
        return year;
    }

    void getAmount(double Amount) {
        this.Amount = Amount;
    }

    double setAmount() {
        return Amount;
    }

    void getPress(int press) {
        this.press = press;
    }

    int setPress() {
        return press;
    }

    void check() {
        Scanner sc = new Scanner(System.in);
        switch (press) {
            case 1:
                System.out.println("How much Money Want to withdraw");
                Del = sc.nextDouble();
                if (Del <= Amount) {
                    double output = Amount - Del;
                    System.out.println("Balance After Withdraw:     " + output);
                }
                else{
                    System.out.println("Insufficent Funds");
                }
                break;
            case 2:
                System.out.println("How Much Money want to add");
                double answer = Amount + Add;
                System.out.println("Total Amount:           " + answer);
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}
