package hwlesson4.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Разработать консольную игру крестик-нолик. В игру ечавствуют два игрока.
         * Они по очереди вводят координаты клетки в которую хотят сделать ход. После
         * каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
         * Игра продолжается до победы одного из игроков или ничьи.
         * */

        /* * * * * * * * * * * * * * * * * * * * * *
        * FIRST VERSION                            *
        * NEED TO REWRITE USING BETTER CODE STILE  *
        * * * * * * * * * * * * * * * * * * * * * **/

        Main.makeGameField(gameField);
        Main.printGameField(gameField);

        boolean isGameEnd = false;
        int row = 0;
        int col = 0;
        String rowString = "";
        String colString = "";
        String player1Sign = "X";
        String player2Sign = "O";

        Scanner scanner = new Scanner(System.in);

        while (!isGameEnd){
            //PLAYER1
            System.out.print(">>Player1 enter row coordinate: ");
            rowString = scanner.next();
            row = Integer.parseInt(rowString);

            while (row > 2 || row < 0){
                System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                rowString = scanner.next();
                row = Integer.parseInt(rowString);
            }

            System.out.print(">>Player1 enter col coordinate: ");
            colString = scanner.next();
            col = Integer.parseInt(colString);

            while (col > 2 || col < 0){
                System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                colString = scanner.next();
                col = Integer.parseInt(colString);
            }

            while(Main.gameField[row][col].equals(player1Sign) || Main.gameField[row][col].equals(player2Sign)){
                System.out.print(">>INCORRECT COORDINATE: Player1, please enter point of free coordinate (sign * on game field)");
                System.out.print("\n>>Player1 enter row coordinate: ");
                rowString = scanner.next();
                row = Integer.parseInt(rowString);

                while (row > 2 || row < 0){
                    System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                    rowString = scanner.next();
                    row = Integer.parseInt(rowString);
                }

                System.out.print(">>Player1 enter col coordinate: ");
                colString = scanner.next();
                col = Integer.parseInt(colString);

                while (col > 2 || col < 0){
                    System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                    colString = scanner.next();
                    col = Integer.parseInt(colString);
                }
            }

            Main.makeMove(row, col, "X");
            Main.printGameField(Main.gameField);

            isGameEnd = Main.win(Main.gameField);
            if(isGameEnd == true)
                break;

            //PLAYER2
            System.out.print(">>Player2 enter row coordinate: ");
            rowString = scanner.next();
            row = Integer.parseInt(rowString);

            while (row > 2 || row < 0){
                System.out.print(">>INCORRECT COORDINATE: Player2 enter 0 or 1 or 2: ");
                rowString = scanner.next();
                row = Integer.parseInt(rowString);
            }

            System.out.print(">>Player2 enter col coordinate: ");
            colString = scanner.next();
            col = Integer.parseInt(colString);

            while (col > 2 || col < 0){
                System.out.print(">>INCORRECT COORDINATE: Player2 enter 0 or 1 or 2: ");
                colString = scanner.next();
                col = Integer.parseInt(colString);
            }

            while(Main.gameField[row][col].equals(player1Sign) || Main.gameField[row][col].equals(player2Sign)){
                System.out.print(">>INCORRECT COORDINATE: Player1, please enter point of free coordinate (sign * on game field)");
                System.out.print("\n>>Player1 enter row coordinate: ");
                rowString = scanner.next();
                row = Integer.parseInt(rowString);

                while (row > 2 || row < 0){
                    System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                    rowString = scanner.next();
                    row = Integer.parseInt(rowString);
                }

                System.out.print(">>Player1 enter col coordinate: ");
                colString = scanner.next();
                col = Integer.parseInt(colString);

                while (col > 2 || col < 0){
                    System.out.print(">>INCORRECT COORDINATE: Player1 enter 0 or 1 or 2: ");
                    colString = scanner.next();
                    col = Integer.parseInt(colString);
                }
            }

            Main.makeMove(row, col, "O");
            Main.printGameField(Main.gameField);

            isGameEnd = Main.win(Main.gameField);

        }

        scanner.close();
    }//main ends

    /* static fields*/
    public static String[][] gameField = new String[3][3];

    /* static methods */
    //#1
    public static void makeGameField(String[][] field){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++)
                field[i][j] = "*";
        }
    }

    //#2
    public static void printGameField(String[][] field){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++)
                System.out.print(field[i][j] + " ");
            System.out.println(" ");
        }
    }

    //#3
    private static void makeMove(int row, int col, String sign){
        Main.gameField[row][col] = sign;
    }

    //#4
    public static boolean win(String[][] field){
        boolean result = false;

        if(field[0][0].equalsIgnoreCase("X") && field[0][1].equalsIgnoreCase("X") && field[0][2].equalsIgnoreCase("X") ||
           field[1][0].equalsIgnoreCase("X") && field[1][1].equalsIgnoreCase("X") && field[1][2].equalsIgnoreCase("X") ||
           field[2][0].equalsIgnoreCase("X") && field[2][1].equalsIgnoreCase("X") && field[2][2].equalsIgnoreCase("X")){
            System.out.println("CONGRATULATIONS: Player1 win`s");
            result = true;
        }else if(field[0][0].equalsIgnoreCase("X") && field[1][0].equalsIgnoreCase("X") && field[2][0].equalsIgnoreCase("X") ||
                 field[0][1].equalsIgnoreCase("X") && field[1][1].equalsIgnoreCase("X") && field[2][1].equalsIgnoreCase("X") ||
                 field[0][2].equalsIgnoreCase("X") && field[1][2].equalsIgnoreCase("X") && field[2][2].equalsIgnoreCase("X")){
            System.out.println("CONGRATULATIONS: Player1 win`s");
            result = true;
        }else if(field[0][0].equalsIgnoreCase("X") && field[1][1].equalsIgnoreCase("X") && field[2][2].equalsIgnoreCase("X") ||
                 field[0][2].equalsIgnoreCase("X") && field[1][1].equalsIgnoreCase("X") && field[2][0].equalsIgnoreCase("X")){
            System.out.println("CONGRATULATIONS: Player1 win`s");
            result = true;
        }else if(field[0][0].equalsIgnoreCase("O") && field[0][1].equalsIgnoreCase("O") && field[0][2].equalsIgnoreCase("O") ||
                 field[1][0].equalsIgnoreCase("O") && field[1][1].equalsIgnoreCase("O") && field[1][2].equalsIgnoreCase("O") ||
                 field[2][0].equalsIgnoreCase("O") && field[2][1].equalsIgnoreCase("O") && field[2][2].equalsIgnoreCase("O")){
            System.out.println("CONGRATULATIONS: Player2 win`s");
            result = true;
        }else if(field[0][0].equalsIgnoreCase("O") && field[1][0].equalsIgnoreCase("O") && field[2][0].equalsIgnoreCase("O") ||
                 field[0][1].equalsIgnoreCase("O") && field[1][1].equalsIgnoreCase("O") && field[2][1].equalsIgnoreCase("O") ||
                 field[0][2].equalsIgnoreCase("O") && field[1][2].equalsIgnoreCase("O") && field[2][2].equalsIgnoreCase("O")){
            System.out.println("CONGRATULATIONS: Player2 win`s");
            result = true;
        }else if(field[0][0].equalsIgnoreCase("O") && field[1][1].equalsIgnoreCase("O") && field[2][2].equalsIgnoreCase("O") ||
                 field[0][2].equalsIgnoreCase("O") && field[1][1].equalsIgnoreCase("O") && field[2][0].equalsIgnoreCase("O")){
            System.out.println("CONGRATULATIONS: Player2 win`s");
            result = true;
        }else{
            result = Main.noFreeSpace(Main.gameField);
            if(result){
                System.out.println("\nThe field has run out of free fields. Draw :)");
                result = true;
            }
        }

          return result;
    }

    private static boolean noFreeSpace(String[][] field){
        boolean result = false;
        int counter = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if( !(field[i][j].equalsIgnoreCase("*")) )
                    counter++;
            }
        }

        if(counter == 9)
            result = true;

        return result;
    }

}//class ends
