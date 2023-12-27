package GetterSetter;

import java.util.*;

class aa3 {
    String Name;
    int year;
    Double Amount;
    int press, Add, Del;

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
}
