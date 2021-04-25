package hwlesson11.task33;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
         * препинания и слов.
         * */

        File fileTask33 = new File("task33.txt");
        int[] punctuationMarks = {33,34,39,40,41,44,46,58,59,63,96};
        int punctuationMarksCounter = 0;
        int englishWordsCounter = 0;
        int spaceMark = 32;
        int previousLetter = 0;

        try(FileReader fileReader = new FileReader(fileTask33)) {
            int i = 0;
            while ((i = fileReader.read()) != -1){
                System.out.print((char)i);
                for(int j = 0; j < punctuationMarks.length; j++){
                    if(i == punctuationMarks[j])
                        punctuationMarksCounter++;
                }
                if(i == spaceMark && (previousLetter >32 && previousLetter < 127 )){
                    englishWordsCounter++;
                }
                previousLetter = i;
            }
            System.out.println("\nDone!");
            System.out.println("Punctuation marks counter = " + punctuationMarksCounter);
            System.out.println("English words counter = " + englishWordsCounter);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }//main ends
}//class ends
