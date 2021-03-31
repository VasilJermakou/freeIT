package hwlesson5.additional.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /**
         * Имеется строка с текстом. Вывести текст,
         * составленный из последних букв всех слов.
         * */

        String line = "Oh jingle bells jingle bells jingle all the way";

        String[] words = line.split(" ");


        Pattern pattern1 = Pattern.compile("[a-zA-Z]$"); //\\w

        for(int i = 0; i < words.length; i++){
            Matcher matcher1 = pattern1.matcher(words[i]);
            while (matcher1.find()){
                System.out.print(matcher1.group() + " ");
            }
        }

    }//main ends
}//class ends
