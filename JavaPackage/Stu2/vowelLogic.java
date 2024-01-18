package JavaPackage.Stu2;

import JavaPackage.Stu1.displaySentence;

public class vowelLogic {
    public void vowelDisp(displaySentence data) {
        String sentence = data.getName();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (isVowel(ch)) {
                System.out.println(ch);
            }
        }
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
