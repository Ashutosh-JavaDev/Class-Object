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
                this.Del = Del;
                System.out.println("Enter Amount Want To Withdraw");
                Del = sc.nextDouble();
                if (Del <= Amount) {
                    double output = Amount - Del;
                    System.out.println("Balance After Withdraw:     " + output);
                }
                break;
            case 2:
                this.Add = Add;
                System.out.println("Enter Amount Want to Credit");
                double answer = Amount + Add;
                System.out.println("Total Amount:           " + answer);
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}
