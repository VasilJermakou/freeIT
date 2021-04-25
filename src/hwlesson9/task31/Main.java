package hwlesson9.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать список оценок учеников с помощью ArrayList,
         * заполнить случайными оценками.
         * Найти самую высокую оценку с помощью итератора.
         * */

        List<Integer> integerList = new ArrayList<>();
        hwlesson9.task29.Main.fillInList(integerList,10);
        hwlesson9.task29.Main.printList(integerList);

        System.out.println("\nFind max value");
        Integer maxValue = Main.findMaxValue(integerList);
        System.out.println(maxValue);

    }//main ends
    /* static methods */
    //#1
    public static Integer findMaxValue(List<Integer> list){
        Integer maxValue = 0;
        if(list.size() > 0){
            maxValue = list.get(0);
            Iterator<Integer> iterator = list.iterator();
            int temp = 0;
            while (iterator.hasNext()){
                temp = iterator.next();
                if(maxValue < temp){
                    maxValue = temp;
                }
            }
        }
        return  maxValue;
    }

}//class ends
