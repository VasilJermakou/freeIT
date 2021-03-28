package hwlesson4.additional.task5;

public class Main {
    public static void main(String[] args) {

        /**
         * "Сожмите" массив, выбросив из него каждый второй элемент.
         * "Освободившиеся" места заполните нулями.
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 20);
        hwlesson4.task4.Main.printArray(array);

        System.out.println("\n===============================");

        Main.changeEvenNumbersToZero(array);
        hwlesson4.task4.Main.printArray(array);

    }//main ends

    /* static methods */
    //#1
    public static void changeEvenNumbersToZero(int[] array){
        if(array.length > 0){
            for(int i = 0; i < array.length; i++){
                if(i % 2 != 0)
                    array[i] = 0;
            }
        }else{
            System.out.println("Array`s length = 0");
        }
    }
}//class ends
