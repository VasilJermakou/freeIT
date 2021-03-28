package hwlesson4.multidimentionalarrays.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Проверить произведение какой диагонали больше
         * (главной или побочной)
         * Х 0 Х
         * 0 Х 0
         * Х 0 Х
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

        int multiplyMain =  Main.multiplyMainDiagonalNumbers(array);
        System.out.println("\nmultiply main = " + multiplyMain);

        int multiplySide = Main.multiplySideDiagonalNumbers(array);
        System.out.println("\nmultiply side = " + multiplySide);

        String answer = (multiplyMain > multiplySide) ? "Main > Side" : (multiplyMain == multiplySide) ? "Main == Side" : "Side > Main";
        System.out.println("\n" + answer);

    }//main ends

    /* static methods*/
    //#1
    public static int multiplyMainDiagonalNumbers(int[][] array){
        int counter = 1;
        int mainDiagonalIndex;

        for(int i = 0; i < array.length; i++){
            mainDiagonalIndex = i;
            for(int j = 0; j < array[i].length; j++){
                if(j == mainDiagonalIndex)
                    counter *= array[i][j];
            }
        }

        return counter;
    }

    //#2
    public static int multiplySideDiagonalNumbers(int[][] array){
        int counter = 1;
        int rowIndex = array[0].length - 1;
        int columnIndex = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == columnIndex && j == rowIndex)
                    counter *= array[i][j];
            }
            columnIndex++;
            rowIndex--;
        }
        return counter;
    }

}//class ends
