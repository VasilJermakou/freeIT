package hwlesson4.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Пользователь вводит с клавиатуры число больше трёх, которое сохраняется в переменную n.
         * Если пользователь ввел не подходящее число, то программа должна выдавать соответствующее
         * сообщение. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на
         * экран. Создать второй массив только из чётных элементов первого массива, если они там есть
         * и вывести его на экран.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>Please enter number (> 3): ");
        int n = scanner.nextInt();

        while (n < 4){
            System.out.print("<<Incorrect value: please enter number > 3:");
            n = scanner.nextInt();
        }

        int[] array = new int[n];
        hwlesson4.task5.Main.fillArray(array, n);
        hwlesson4.task4.Main.printArray(array);

        System.out.println(" ");

        int[] evenNumArray =  Main.createEvenNumberArray(array);
        hwlesson4.task4.Main.printArray(evenNumArray);

    }//main ends

    /* static methods */
    //#1
    public static int countEvenNumbers(int[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0)
                counter++;
        }
        return counter;
    }

    //#2
    public static int[] createEvenNumberArray(int [] array){
        int size = countEvenNumbers(array);
        int[] evenNumberArray;
        int index = 0;
        if(size > 0){
            evenNumberArray = new int[size];
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0)
                    evenNumberArray[index++] = array[i];
            }
        }else
            evenNumberArray = new int[0];
        return evenNumberArray;
    }

}//class ends
