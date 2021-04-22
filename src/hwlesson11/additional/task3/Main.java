package hwlesson11.additional.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Проверка на цензуру:
         * Создаете 2 файла.
         * 1 - й. Содержит исходный текст.
         * 2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
         * определите сами, хотите каждое слово на новой строке, хотите через запятую
         * разделяйте, ваша программа делайте как считаете нужным.
         * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
         * встретилось ни одного недопустимого слова, то выводите сообщение о том что
         * текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
         * сообщение, кол-во предложений не прошедших проверку и сами предложения
         * подлежащие исправлению.
         *
         * Source text:
         * I live in a house near the wow mountains.
         * I have two brothers and one sister, and I was born last.
         * So My father teaches mathematics, and my mother is a nurse at a big hospital.
         * My brothers are very smart and work hard in school.
         * My sister is a nervous So girl, but she is very kind.
         * My grandmother also lives with us.
         * She came from Italy when I was two years old.
         * She has grown old, but she is still very strong.
         *
         * Fillers words:
         * well, so, anyway, basically, yeah, wow
         * */

        try(BufferedReader bufferedReaderSourceText = new BufferedReader(new FileReader("sourceText.txt"));
            BufferedReader bufferedReaderBlackList = new BufferedReader(new FileReader("fillersWords.txt"))){

            List<String> sourceTextList = new ArrayList<>();
            List<String> blackList = new ArrayList<>();
            String tempSource;

            //read source text from file to string list
            while ((tempSource = bufferedReaderSourceText.readLine()) != null){
                sourceTextList.add(tempSource);
            }
            //print source string list
            System.out.println(sourceTextList.toString());

            //read fillers text from file to blackList
            while((tempSource = bufferedReaderBlackList.readLine()) != null){
                blackList.add(tempSource);
            }
            //print black list
            System.out.println(blackList);

            //next step
            Main.textCensorship(sourceTextList, blackList);

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }//main ends
    /* static methods */
    public static void textCensorship(List<String> source, List<String> blackList){
        String[] blackListArray = new String[blackList.size()];
        String[] arrayPart;
        String currentWord;
        boolean isFillerText = false;

        for (int i = 0; i < blackList.size(); i++){
            blackListArray[i] = blackList.get(i);
        }

        for(int i = 0; i < source.size(); i++){
            arrayPart = source.get(i).split(" ");
            for(int k = 0; k < arrayPart.length; k++){
                currentWord = arrayPart[k];
                for(int j = 0; j < blackListArray.length; j++){
                    if(currentWord.equalsIgnoreCase(blackListArray[j])){
                        System.out.println("Filler word in sentence #" + i+1 + ",  filler word = " + blackListArray[j]);
                        isFillerText =true;
                    }
                }
            }
        }

        if(isFillerText){
            System.out.println("Text has filler words!!!");
        }else
            System.out.println("Text has`t got any fillers words!!!");
    }
}//class ends