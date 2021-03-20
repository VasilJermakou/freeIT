package hwlesson2.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 7.
         * В переменную записываете количество программистов.
         * В зависимости от количества программистов необходимо вывести правильно окончание.
         * Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
         * */

        System.out.println("===========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Введите количество программистов: ");
        String stringNumber = scanner.next();
        int number = Integer.parseInt(stringNumber);

        if(number == 1 || number > 20 && number % 10 == 1)
            System.out.println(number + " программист");
        else if(number > 1 && number < 5 || number > 21 && number % 10 == 2 || number % 10 == 3 || number % 10 == 4)
            System.out.println(number + " программиста");
        else
            System.out.println(number + " программистов");

        System.out.println("===========================================");

    }//main ends
}//class ends
