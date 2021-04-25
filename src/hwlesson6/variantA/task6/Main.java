package hwlesson6.variantA.task6;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывести фамилию разработчика, дату и время получения задания
         * и дату и время сдачи задания.
         * */

        //To compile from cmd
        //javac -d . Main.java

        //To run from cmd
        //java hwlesson6.variantA.task6.Main

        String developerFamilyName = "Ermakov";
        LocalDateTime dateAntTimeGetTask = LocalDateTime.of(2021,4, 2, 10, 30);
        LocalDateTime dateAndTimeFinishedtask = LocalDateTime.of(2021,4, 4, 22,10);
        System.out.println("Developer`s family name: " + developerFamilyName);
        System.out.println("Date and time get task: " + dateAntTimeGetTask);
        System.out.println("Date and time finished task: " + dateAntTimeGetTask);

    }//main ends
}//class ends
