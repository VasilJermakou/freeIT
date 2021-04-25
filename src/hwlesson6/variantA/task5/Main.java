package hwlesson6.variantA.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Ввести целые числа как аргументы командной строки,
         * подсчитать их суммы(произведения), и вывести результат на консоль.
         * */

        //To compile
        //javac -d . Main.java

        //To run from cmd
        //java hwlesson6.variantA.task5.Main @param1 @param2 ...

        System.out.println("****************************************");

        System.out.println("Sum of numbers: ");

        String stringValue = "";
        int intValue = 0;

        for(int i = 0; i < args.length; i++){
            stringValue = args[i];
            intValue += Integer.parseInt(stringValue);
        }
        System.out.println(intValue);

        System.out.println("Multiply of numbers: ");
        for(int i = 0; i < args.length; i++){
            stringValue = args[i];
            intValue *= Integer.parseInt(stringValue);
        }
        System.out.println(intValue);

        System.out.println("****************************************");


    }//main ends
}//class ends
