package hwlesson4.task6;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из 4 случайных целых чисел из отрезка [0; 10],
         * выведите его на экран в строку. Определить и вывести на экран сообщение о том,
         * является ли массив строго возрастающей последовательностью.
         * xn < xn+1
         * */

        int [] array = new int[4];

       /* array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;       //true*/

        hwlesson4.task5.Main.fillArray(array, 10);
        hwlesson4.task4.Main.printArray(array);

        boolean result = Main.isStrictAscendingSequence(array);
        System.out.println(result);

    }//main ends

    /* static methods */
    //#1
    public static boolean isStrictAscendingSequence(int [] array){
        boolean result = false;
        int current = 0;
        int next = 0;
        for(int i = 0; i < array.length; i++){
            current = array[i];

            if(i < array.length - 1)
                next = array[i + 1];
            else{
                current = array[i - 1];
                next = array[i];
            }

            if(((next - current) == 1) == true){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        return result;
    }

}//class ends
