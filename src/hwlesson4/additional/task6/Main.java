package hwlesson4.additional.task6;

public class Main {
    public static void main(String[] args) {

        /**
         * Проверить, различны ли все элементы массивы.
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 20);
        hwlesson4.task4.Main.printArray(array);

        System.out.println("");
        boolean result = Main.isAllNumbersDifferent(array);
        System.out.println("Is all numbers are different in array: " + result);


    }//main ends

    /* static methods */
    //#1
    public static boolean isAllNumbersDifferent(int[] array){
        boolean result = true;
        int currentNumber;
        if(array.length > 0){
            for(int i = 0; i < array.length; i++){
                currentNumber = array[i];
                for(int j = i+1; j < array.length; j++){
                    if(currentNumber == array[j]){
                        System.out.println(currentNumber + " equals " + array[j]);
                        System.out.println("Array has equals numbers");
                        result = false;
                        return result;
                    }
                }
            }
        }else{
            System.out.println("Array`s length = 0");
            result = false;
        }

        return result;
    }
}//class ends
