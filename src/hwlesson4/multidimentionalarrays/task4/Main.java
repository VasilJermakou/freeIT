package hwlesson4.multidimentionalarrays.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Посчитать сумму чётных элементов стоящих над побочной диагональю (не включительно)
         * 1 1 Х
         * 1 Х 0
         * Х 0 0
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
        int counter = Main.countEvenNumbersOverSideDiagonal(array);
        System.out.println("\nCounter = " + counter);

    }//main ends

    /* static methods */
    //#1
    public static int countEvenNumbersOverSideDiagonal(int[][] array){
        int rowIndex = array[0].length - 1;
        int columnIndex = 0;
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i <= columnIndex && j < rowIndex){
                    if(array[i][j] % 2 == 0)
                        counter += array[i][j];
                }
            }
            rowIndex--;
            columnIndex++;
        }

        return counter;
    }//method ends

}//class ends
