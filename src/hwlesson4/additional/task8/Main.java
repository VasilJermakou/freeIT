package hwlesson4.additional.task8;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти второй по величине (т.е. следующий по величине за
         * максимальным) элемент в массиве.
         * */

        int [] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 10);
        hwlesson4.task4.Main.printArray(array);

        Main.findSecondMaxNumber(array);

    }//main ends

    /* static methods */
    //#1
    public static int findSecondMaxNumber(int[] array){
        int maxNum = 0;
        int secondMaxNum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > maxNum){
                secondMaxNum = maxNum;
                maxNum = array[i];
            }

            if(array[i] > secondMaxNum && array[i] < maxNum)
                secondMaxNum = array[i];
        }
        System.out.println("\nSecond max number = " + secondMaxNum);
        return secondMaxNum;
    }

}//class ends
