package hwlesson8.date.task3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss
         * Задачи решаются двумя способами, используя библиотеку java.util и java.time
         * */

        String pattern1 = "yyyy MM dd kk:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
        Date date1 = new Date(); //current date
        String result = simpleDateFormat.format(date1);

        System.out.println(date1);  //ordinary version
        System.out.println(result); //pattern version

        System.out.println("==============================");

        LocalDateTime localDateTime = LocalDateTime.now(); //current date
        String pattern2 = "yyyy MM dd hh:mm:ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern2);
        result = dateTimeFormatter.format(localDateTime);

        System.out.println(localDateTime);  //ordinary version
        System.out.println(result);         //pattern version

    }//main ends
}//class ends
