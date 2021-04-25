package hwlesson6.variantA.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Ввести пароль из командной строки и сравнить его со строкой-образцом.
         * */

        //To compile
        //javac -d . Main.java

        //To run from cmd
        //java hwlesson6.variantA.task4.Main

        String password = "MyPassWord1";

        Scanner scanner = new Scanner(System.in);

        System.out.println(">>Enter your password, please: ");
        String userPassword = scanner.next();

        if(password.equals(userPassword)){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect password!");
        }


    }//main ends
}//class ends
