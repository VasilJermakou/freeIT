package hwlesson4.task2;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из всех нечётных чисел от 0 до 99, выведите его на экран в строку,
         * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке.
         * */

       int[] numbers = new int[50];
       int index = 0;

       //fill the array by odd numbers
       for(int i = 1; i < 100; i++){
           if(i % 2 != 0){
               numbers[index++] = i;
           }
       }

       System.out.printf("print array: \n");
       Main.printIntArray(numbers);

       System.out.printf("\nrevers print array: \n");
       Main.reversPrintIntArray(numbers);


    }//main ends
    /* static methods */
    //#1
    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print("[" + i + "]" + " = " + array[i] + " ");
    }

    //#2
    public static void reversPrintIntArray(int[] array){
        for(int i = array.length - 1; i >= 0; i--)
            System.out.print("[" + i + "]" + " = " + array[i] + " ");
    }

}//class ends
