package hwlesson2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 3.
         * Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным,
         * то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.
         * */

        System.out.println("===========================================");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println(">>Enter your value: ");
            String stringValue = scanner.next();
            System.out.println("===========================================");

            int intValue = Integer.parseInt(stringValue);

            if(intValue > 0)
                intValue++;
            else if(intValue < 0)
                intValue -= 2;
            else
                intValue = 10;

            System.out.println("Result: " + intValue);
            System.out.println("===========================================");

            String status = "";
            while (flag){
                System.out.println(">>Would you like to continue(Y/N): ");
                status = scanner.next();

                if(status.equalsIgnoreCase("N")){
                    flag = false;
                    break;
                }
                else if(status.equalsIgnoreCase("Y"))
                    break;
                else
                    System.out.println("Incorrect value! Enter Y/N please: ");
            }
        }while(flag);

        System.out.println("===========================================");

    }//main ends
}//class ends
