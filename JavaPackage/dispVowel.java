package JavaPackage;
import JavaPackage.Stu1.displaySentence;
import JavaPackage.Stu2.vowelLogic;
public class dispVowel {
    public static void main(String[] args) {
        displaySentence ob=new displaySentence();
        vowelLogic ob2=new vowelLogic();
        ob.disp();
        ob2.vowelDisp(ob);
    }
}
