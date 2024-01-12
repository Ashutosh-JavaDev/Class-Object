package GetterSetter;

import java.util.Scanner;

class person {
    int age;
    String name;

    void disp(String name) {
        this.name = name;
    }

    String putNAme() {
        return name;
    }

    void dispage(int age) {
        this.age = age;
    }

    int putage() {
        return age;
    }
}

public class Person {

}
