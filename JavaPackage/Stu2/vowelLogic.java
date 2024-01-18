package JavaPackage.Stu2;

import JavaPackage.Stu1.displaySentence;

public class vowelLogic {
    public void vowelDisp(displaySentence data){
       for(int i=0;i<data.getName().length();i++){
        if(data.getName().equalsIgnoreCase("a")|| data.getName().equalsIgnoreCase("e")|| data.getName().equalsIgnoreCase("i")||data.getName().equalsIgnoreCase("o")||data.getName().equalsIgnoreCase("u")){
            System.out.println(data);
        }
       }
    }
}
