package hwlesson4.task1;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из всех четных чисел от 2 до 20 и выведите элементы
         * массива на экран сначало в строку, отделяя один элемент от другого пробелом,
         * а затем в столбик(отделяя один элемент от другого началом новой строки).
         * Перед созданием массива подумайте, какого он будет размера.
         * */

        Integer []array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Main.print(array);

        Double[] array2 = {2.2, 4.4, 6.6, 8.8, 10.1, 12.2, 14.4, 16.6, 18.8, 20.2};
        Main.print(array2);


    }//main ends

    /* static methods */
    //#1
    public static<T> void print(T[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.printf("\n========================\n");

        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }

}//class ends
