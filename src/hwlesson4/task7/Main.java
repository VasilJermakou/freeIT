package hwlesson4.task7;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из 12 случайных целых чисел из отрезка [0;15].
         * Определите какой элемент является в этом массиве максимальным
         * и сообщите индекс его последнего кхождения.
         * */

        int[] array = new int[12];

        hwlesson4.task5.Main.fillArray(array, 15);
        hwlesson4.task4.Main.printArray(array);
        int result = Main.findMaxNumber(array);
        System.out.println("\nMax number = " + result);

    }//main ends

    /* static methods*/
    //#1
    public static int findMaxNumber(int[] array){
        int result = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > result)
                result = array[i];
        }
        return result;
    }


}//class ends
