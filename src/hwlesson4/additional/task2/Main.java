package hwlesson4.additional.task2;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти среднее арифмитическое элементов с нечетными номерами.
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 50);
        hwlesson4.task4.Main.printArray(array);
        double average = 0;
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                average += array[i];
                counter++;
            }
        }

        double result = 0;

        if(counter != 0)
            result = average / counter;

        System.out.printf("\nAverage = %.2f", result);

    }//main ends
}//class ends
