package hwlesson8.date.task1;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /**
         * По введенной дате вывести название месяца.
         * Задачи решаются двумя способами, используя библиотеку java.util и java.time
         * */

        //java.util.Date
        Date date = new Date(); //current date
        System.out.println(date);
        System.out.println(date.getMonth());

        System.out.println("===============================");

        //java.time
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());

    }//main ends
}//class ends
