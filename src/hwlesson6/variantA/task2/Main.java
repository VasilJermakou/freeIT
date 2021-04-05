package hwlesson6.variantA.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Отобразить в окне консоли аргументы
         * командной строки в обратном порядке.
         * */

        /* * * * * * * * * * * * * * * * * * * * * * *
        * On Compiling process use this command:
        * javac -d . [FileName.java]
        *
        * To Run the class please use this command:
        * java [Package].[ClassName]
        * * * * * * * * * * * * * * * * * * * * * * * */

        //To compile
        //javac -d . Main.java

        //To run
        //java hwlesson6.variantA.task2.Main first second

        System.out.println("Main run`s!");

        for(int i = args.length - 1; i >= 0; i--)
            System.out.println(args[i]);


    }//main ends
}//class ends
