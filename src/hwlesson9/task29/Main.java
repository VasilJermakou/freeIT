package hwlesson9.task29;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
         * Удалить неудовленворительные оценки из списка.
         * */

        //Create list of marks"
        List<Integer> marksList = new ArrayList<>(10);
        marksList = Main.fillInList(marksList, 10);

        System.out.println("Print");
        Main.printList(marksList);

        System.out.println("");

        System.out.println("\nPrint using listIterator");
        ListIterator<Integer> listIterator = marksList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");

        System.out.println("\nPrint marks using Stream API");
        marksList.stream().filter((mark) -> mark >=4 ).forEach(System.out::println);

        System.out.println("\nRemove unsatisfactory marks");
        List<Integer> resultList = Main.deleteUnsatisfactoryMark(marksList);
        Main.printList(resultList);

    }//main ends
    /* static functions */
    //#1
    public static List<Integer> fillInList(List<Integer> list, int size){
        Integer number = 0;
        Random random = new Random();
        for(int i = 0; i < size; i++){
            number = random.nextInt(10) + 1;
            list.add(number);
        }
        return list;
    }

    //#2
    public static void printList(List<?> list){
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    //#3
    public static List<Integer> deleteUnsatisfactoryMark(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 4){
                System.out.println("index " + i + " = " +list.get(i));
                list.remove(i);
            }
        }
        return list;
    }

}//class ends
