package hwlesson9.task30;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать коллекцию , наполнить ее случайными числами.
         * Удалить повторяющиеся числа.
         * */

        List<Integer> integerList = new ArrayList<>(10);
        hwlesson9.task29.Main.fillInList(integerList, 10);
        System.out.println("Print list");
        hwlesson9.task29.Main.printList(integerList);

        System.out.println(" ");
        Main.removeDuplicateNumbers(integerList);
        System.out.println("Print list without duplicated numbers");
        hwlesson9.task29.Main.printList(integerList);

    }//main ends
    /* static  methods */
    //#1
    public static void removeDuplicateNumbers(List<Integer> list){
        int currentValue = 0;

        for(int i = 0; i < list.size(); i++){
            currentValue = list.get(i);
            for(int j = i+1; j < list.size(); j++){
                if(list.get(j) == currentValue)
                    list.remove(j);
            }
        }
    }
}//class ends
