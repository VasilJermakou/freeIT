package hwlesson4.additional.task10;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти максимальный элемент в массиве и
         * поменять его местами с нулевым элементом.
         * */

        //task 7
        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 20);
        hwlesson4.task4.Main.printArray(array);

        System.out.println("\n=======================");

        Main.changeMaxNumberWithFirstNumber(array);
        hwlesson4.task4.Main.printArray(array);


    }//main ends

    /* static methods */
    //#1
    public static int[] changeMaxNumberWithFirstNumber(int[] array){

        int result = array[0];
        int index = 0;
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > result){
                result = array[i];
                index = i;
            }
        }

        temp = array[0];
        array[0] = array[index];
        array[index] = temp;

        return  array;
    }

}//class ends
