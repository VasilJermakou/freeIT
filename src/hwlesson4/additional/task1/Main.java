package hwlesson4.additional.task1;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти произведение элементов, кратных трём.
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 100);
        hwlesson4.task4.Main.printArray(array);

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0)
                System.out.println(array[i]);
        }

    }//main ends
}//class ends
