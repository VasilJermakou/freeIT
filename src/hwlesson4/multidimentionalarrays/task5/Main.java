package hwlesson4.multidimentionalarrays.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Транспортировать матрицу (1 столбец станет 1 строкой,
         * 2 столбец станет 2 строкой и т.д.)
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

        System.out.println("\n");

        Main.arrayTransportation(array);
        hwlesson4.multidimentionalarrays.task1.Main.printMultiDimentionalArray(array);

    }//main ends

    /* static methods */
    //#1
    public static int[][] arrayTransportation(int[][] array){
        int mainDiagonalIndex;
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            mainDiagonalIndex = i;
            for(int j = mainDiagonalIndex; j < array[i].length; j++){
                if(j != mainDiagonalIndex){
                    temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }

        return array;
    }

}//class ends
