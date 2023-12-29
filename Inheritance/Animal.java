package Inheritance;

import java.util.Scanner;

class animal {
    String sound;

    void makeSound() {
        sound = "Meow";
    }

    String putSound() {
        return sound;
    }
}

class cat extends animal {
    void Voice() {
        makeSound();
        System.out.println("Cat:    " + putSound());
    }
}

public class Animal {
    public static void main(String[] args) {
        cat ob = new cat();
        ob.Voice();
    }
}
