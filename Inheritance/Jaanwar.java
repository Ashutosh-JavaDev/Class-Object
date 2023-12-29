package Inheritance;
class jaanwar{
    void move(){
        System.out.println("Cheetah Move");
    }
}
class Cheetah extends jaanwar{
    void move(){
        System.out.println("Cheetah Run");
    }
}
public class Jaanwar {
    public static void main(String[] args) {
        Cheetah ob=new Cheetah(); 
        ob.move();
    }
}
