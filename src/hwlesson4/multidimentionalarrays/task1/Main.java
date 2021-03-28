package hwlesson4.multidimentionalarrays.task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Посчитать сумму чётных элементов стояхих на главной диагонали
         * Х 0 0
         * 0 Х 0
         * 0 0 Х
         * */

        int row = 0;
        int column = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(">>Enter row value: ");
        row = scanner.nextInt();
        while (row <= 0){
            System.out.print("Incorrect value! Enter positive number (> 0): ");
            row = scanner.nextInt();
        }

        System.out.print("Enter column value: ");
        column = scanner.nextInt();
        while (column <= 0){
            System.out.print("Incorrect value! Enter positive number (> 0): ");
            column = scanner.nextInt();
        }

        int [][] array = new int[row][column];
        Main.fillMultiDimentionalArray(array);
        Main.printMultiDimentionalArray(array);

        int result = Main.countMainDiagonalEvenNumbers(array);
        System.out.println("result = " + result);

    }//main ends

    /* static methods */
    //#1
    public static int[][] fillMultiDimentionalArray(int [][] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(50) + 1;
            }
        }
        return  array;
    }

    //#2
    public static void printMultiDimentionalArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println(" ");
        }
    }

    //#3
    public static int countMainDiagonalEvenNumbers(int [][] array){
        int counter = 0;
        int mainDiagonalIndex;

        for(int i = 0; i < array.length; i++){
            mainDiagonalIndex = i;
            for(int j = 0; j < array[i].length; j++){
                if(j == mainDiagonalIndex && array[i][j] % 2 == 0)
                    counter += array[i][j];
            }
        }

        return counter;
    }

}//class ends
