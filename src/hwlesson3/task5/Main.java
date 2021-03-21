package hwlesson3.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 5.
         * Напишите программу печати таблицы перевода расстояний
         * из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
         * 1 дюйм = 2,54 см
         * */

        System.out.println("===========================================");
        final double CENTIMETERS_IN_ONE_INCH = 2.54;

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Enter number of inches: ");
        String stringInches = scanner.next();
        double doubleInches = Double.parseDouble(stringInches);
        double result = doubleInches * CENTIMETERS_IN_ONE_INCH;
        System.out.println(stringInches + " inches contains " + result + " centimeters");
        System.out.println("===========================================");

    }//main ends
}//class ends
