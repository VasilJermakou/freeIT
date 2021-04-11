package hwlesson8.date.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /**
         * По введенной дате вывести возраст
         * Задачи решаются двумя способами, используя библиотеку java.util и java.time
         * */

        //java.util.Date
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> Enter year of birth(example 1987): ");
        System.out.println("<<");
        String year = scanner.next();

        Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher = pattern.matcher(year);

        while (!matcher.find()){
            System.out.println(">> Incorrect value: please enter year in number format(example 1987): ");
            System.out.println("<<");
            year = scanner.next();
            matcher = pattern.matcher(year);
        }

        System.out.println(">> Enter month of birth(example - march): ");
        System.out.println("<<");
        String month = scanner.next();

        pattern = Pattern.compile("[a-zA-Z]");
        matcher = pattern.matcher(month);

        while (!matcher.find()){
            System.out.println(">> Incorrect value: please enter month in String format(example march): ");
            System.out.println("<<");
            month = scanner.next();
            matcher = pattern.matcher(month);
        }

        System.out.println(">> Enter day of birth(example 14): ");
        System.out.println("<<");
        String day = scanner.next();

        pattern = Pattern.compile("\\d");
        matcher = pattern.matcher(day);

        while (!matcher.find()){
            System.out.println(">> Incorrect value: please enter day in number format(example 03): ");
            System.out.println("<<");
            day = scanner.next();
            matcher = pattern.matcher(day);
        }

        String dateOfBirth = year + " " + month + " " + day;
        System.out.println(dateOfBirth);
        Long date = Date.parse(dateOfBirth);
        Date date1 = new Date(date);
        System.out.println(date1);

        Date currentDate = new Date();
        int age = currentDate.getYear() - date1.getYear();
        System.out.println("Age = " + age);

        scanner.close();

        System.out.println("=====================================");

        //java.time
        LocalDate localDate1 = LocalDate.of(1987, 03, 14);
        LocalDate localDate2 = LocalDate.now();

        int y = localDate2.get(ChronoField.YEAR) - localDate1.getYear();
        System.out.println("Age = " + y);

    }//main ends
}//class ends
