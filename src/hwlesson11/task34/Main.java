package hwlesson11.task34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /**
         * Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
         * распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
         * распечатать.
         * */

        File task34File = new File("task34.txt");
        try {
            FileReader fileReader = new FileReader(task34File);
            int i = 0;
            int spaceMark = 32;
            StringBuilder sb = new StringBuilder("");

            //check numbers and spaces
            while ((i = fileReader.read()) != -1){
                //System.out.print((char)i);
                if(i > 47 && i < 58 || i == spaceMark){
                    sb.append((char)i);
                }
            }
            System.out.println("\nDone!");

            //remove extra spaces
            String numberString = sb.toString();
            numberString = numberString.replaceAll("\\s+", " ");

            //put string numbers to string array
            String delimeter = " ";
            String[] stringArray = numberString.split(delimeter);

            //parse string numbers to integers
            int temp = 0;
            int[] numbers = new int[stringArray.length];
            for(int n = 0; n < numbers.length; n++){
                if(stringArray[n].equals(" ") || stringArray[n]. equals(""))
                    continue;
                else{
                    temp = Integer.parseInt(stringArray[n]);
                    numbers[n] = temp;
                }
            }

            //print result
            for(int num : numbers)
                System.out.print(num + " ");

            //calculate summ of numbers
            int counter = 0;
            for(int c = 0; c < numbers.length; c++){
                counter += numbers[c];
            }
            System.out.println("\nSumm of numbers = " + counter);

            //remove all repeating numbers
            int currentNum = 0;
            boolean isNotRepeatNumber = true;
            for(int a = 0; a < numbers.length; a++){
                currentNum = numbers[a];
                for(int b = a+1; b < numbers.length; b++){
                    if(currentNum == numbers[b]){
                        isNotRepeatNumber = false;
                        break;
                    }
                }
                if(isNotRepeatNumber)
                    System.out.print(currentNum + " ");

                isNotRepeatNumber = true;
            }

            fileReader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }//main ends
}//class ends
