package hwlesson9.task32;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /**
         * Имеется текст. Следует составить для него частотный словарь.
         * */

        String text = "aaa bb c dddd ee fffffff";
        System.out.println("Using countLetters method");
        Main.countLetters(text);

    }//main ends
    /* static methods */
    //#1
    public static void countLetters(String text){
        char [] charAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M',
                                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        text = text.toUpperCase(Locale.ROOT);
        char [] chars = text.toCharArray();
        int counter = 0;
        char current = 'A';
        for(int i = 0; i < charAlphabet.length; i++){
            current = charAlphabet[i];
            for (int j = 0; j < chars.length; j++){
                if(chars[j] == current)
                    counter++;
            }
            if(counter > 0)
                System.out.println("Letter " + current + " repeating" + counter + "times;");
            counter = 0;
        }
    }
}//class ends
