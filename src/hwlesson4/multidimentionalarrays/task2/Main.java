package hwlesson4.multidimentionalarrays.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывести нечётные элементы находящиеся под главной диагональю (включительно).
         * Х 0 0
         * 1 Х 0
         * 1 1 Х
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
        hwlesson4.multidimentionalarrays.task1.Main.fillMultiDimentionalArray(array);
        hwlesson4.multidimentionalarrays.task1.Main.printMultiDimentionalArray(array);
        Main.printOddNumbersUnderMainDiagonal(array);


    }//main ends

    /* static methods */
    //#1
    public static void printOddNumbersUnderMainDiagonal(int[][] array){
        int mainDiagonalIndex = -1;
        for(int i = 0; i < array.length; i++){
            ++mainDiagonalIndex;
            for(int j = 0; j < array[i].length; j++){
                if(i <= mainDiagonalIndex && j < mainDiagonalIndex)
                    System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }//method ends

}//class ends
