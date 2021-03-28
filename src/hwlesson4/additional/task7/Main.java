package hwlesson4.additional.task7;

public class Main {
    public static void main(String[] args) {

        /**
         * Подсчитать сколько раз встречается элемент с заданным значением.
         * */

        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        hwlesson4.task4.Main.printArray(array);

        int repetition = 7;
        int result = Main.countNumberRepetition(array, repetition);
        System.out.println("\nrepetition of " + repetition + " = " + result);

    }//main ends

    /* static methods */
    //#1
    public static int countNumberRepetition(int [] array, int number){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number)
                counter++;
        }
        return counter;
    }

}//class ends
