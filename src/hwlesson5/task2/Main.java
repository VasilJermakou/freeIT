package hwlesson5.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Заменить все вхождения символа стоящего в позиции (3)
         * на символ стоящий в позиции (0).
         * */

        String line = "abcdabcdabcd";
        String result = Main.changeSymbolOnIndexThreeToIndexZero(line);
        System.out.println(result);


    }//main ends

    /* static methods */
    public static String changeSymbolOnIndexThreeToIndexZero(String line){
        char [] chars = line.toCharArray();
        int indexOut = 2;
        int indexPut = 0;
        char charOut = chars[indexOut];
        char charPut = chars[indexPut];

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == charOut)
                chars[i] = charPut;
        }

        String result = Arrays.toString(chars);
        return result;
    }
}
