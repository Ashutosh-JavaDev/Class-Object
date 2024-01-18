package JavaPackage.Stu2;
class putData{
    String Name;
    int age,roll;
    void disp(){
        System.out.println("Name:   "+Name);
        System.out.println("Age:    "+age);
        System.out.println("Roll:   "+roll);
    }
}
public class PuttingData {
    public static void main(String[] args) {
        putData ram[]=new putData[5];
        System.out.println("---------------------------------------------");
        System.out.println("Student details");

        for(int i=0;i<5;i++){
            System.out.println(ram[i]);
        }
    }
}
