package hwlesson4.additional.task4;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти наименьший нечётный элемент
         * */

        int[] array = new int[10];

        hwlesson4.task5.Main.fillArray(array,20);
        hwlesson4.task4.Main.printArray(array);

        //find smallest number
        int smallNumber = Main.findSmallestNumber(array);
        System.out.println("\n" + smallNumber);

        //find smallest odd number
        smallNumber = Main.findSmallestOddNumber(array);
        System.out.println("\n" + smallNumber);


    }//main ends

    /* static methods */
    //#1
    public static int findSmallestNumber(int[] array){
        int smallNumber = 0;
        if(array.length > 0){
            smallNumber = array[0];
            for(int i = 0; i < array.length;i++){
                if(array[i] < smallNumber)
                    smallNumber = array[i];
            }
        }else{
            System.out.println("Length of array = 0");
            return -1;
        }
        return smallNumber;
    }

    //#2
    public static int findSmallestOddNumber(int[] array){
        int tempNumber = 2_147_483_647;
        if(array.length > 0){
            tempNumber = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 != 0)
                    if(array[i] < tempNumber)
                        tempNumber = array[i];
            }
        }else{
            System.out.println("Length of array = 0");
            return -1;
        }
        return tempNumber;
    }//ends method

}//class ends
