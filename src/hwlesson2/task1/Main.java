package hwlesson2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 1.
         * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
         * и положительное оно или отрицательное. Например, "это однозначное положительное число".
         * Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.
         * */

        /* Take value from user */
        System.out.println("===========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Enter your number: ");
        String stringNumber = scanner.next();
        System.out.println("===========================================");

        /* values */
        int number = Integer.parseInt(stringNumber);
        int result = 0;
        int startNumber = number;

        /* check positive or negative number */
        String numberStatus = (number >= 0) ? "This is positive value" : "This is negative value";
        System.out.println(numberStatus);

        List<Integer> numbers = new ArrayList<>();

        /* if negative number convert it to positive */
        number = Math.abs(number);

        /* count how many numbers start value contain */
        int counter = 0;
        while(number > 0){
            counter++;
            result = number % 10;
            numbers.add(result);
            number = number / 10;
        }

        /* print the results */
        System.out.println("Number " + startNumber + " contains from " + counter + " number(s).");
        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        System.out.print("They are: ");
        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + ", ");

        System.out.println("\n===========================================");

    }//main ends
}//class ends
