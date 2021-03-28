package hwlesson4.additional.task9;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти наименьший элемент среди элементов
         * с чёиными индексами массива.
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 10);
        hwlesson4.task4.Main.printArray(array);

        int result = Main.findSmallestEvenIndexElement(array);
        System.out.println("\nSmallest even index number = " + result);

    }//main ends

    /* static methods */
    //#1
    public static int findSmallestEvenIndexElement(int[] array){
        int smallNum = array[0];

        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                if(array[i] < smallNum)
                    smallNum = array[i];
            }
        }

        return smallNum;
    }
}//class ends
