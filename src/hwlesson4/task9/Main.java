package hwlesson4.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Пользователь должен указать с клавиатуры положительное число,
         * а программа должна создать массив указанного размера из случайных
         * целых чисел из [0;15] и вывести его на экран в строку.
         * После этого программа должна определить и сообщить пользователю о том,
         * сумма какой половины массива больше: левой или правой, либо сообщить
         * что эти суммы модулей равны.
         * Если пользователь введёт неподходящее число, то выдать соответствующее сообщение.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>Enter size of array: ");
        int size = scanner.nextInt();

        while (size <= 0){
            System.out.println("<<Incorrect size value: enter positive number!");
            size = scanner.nextInt();
        }

        int[] array = new int[size];
        hwlesson4.task5.Main.fillArray(array, 15);
        hwlesson4.task4.Main.printArray(array);

        Main.checkLargestArraySide(array);

    }//main ends

    /* static methods */
    /**
     * @param array - integer array
     * if array size is even number than bouth side of array are equals
     * if array side is odd number than left side had n - 1 number than right side
     */
    public static void checkLargestArraySide(int [] array) {
        int leftSize,rightSize;
        int leftCounter = 0;
        int rightCounter = 0;

        if (array.length % 2 == 0) {
            leftSize = array.length / 2;
            rightSize = array.length - leftSize;
            for (int i = 0; i < leftSize; i++)
                leftCounter += array[i];

            for (int i = leftSize; i < array.length; i++) {
                rightCounter += array[i];
            }
        } else {
            leftSize = array.length / 2;
            rightSize = array.length - leftSize;
            for (int i = 0; i < leftSize; i++)
                leftCounter += array[i];

            for (int i = leftSize; i < array.length; i++) {
                rightCounter += array[i];
            }
        }
        String message = (leftCounter > rightCounter) ? "left side bigger" : (leftCounter == rightCounter) ? "left side equals right side " : "right side bigger";
        System.out.println("\n" + message);
    }

}//class ends
