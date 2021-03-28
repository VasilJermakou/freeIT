package hwlesson4.task8;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать два массива из 10 целых случайных чисел из отрезка [0;9]
         * и третий массив из 10 действительных чисел.Каждый элемент с i-ым индексом
         * третьего массива должен ровняться отношению элемента из первого массива с i-ым
         * индексом к элементу из второго массива с  i-ым индексом. Вывести все три массива
         * на экран (каждый на отдельной строке), затем вывести колличество целых элементов
         * в третьем массиве.
         * */

        int [] arrayOne = new int[10];
        int [] arrayTwo = new int[10];
        double[] arrayThree = new double[10];

        hwlesson4.task5.Main.fillArray(arrayOne, 9);
        hwlesson4.task5.Main.fillArray(arrayTwo, 9);

        hwlesson4.task4.Main.printArray(arrayOne);
        System.out.println(" ");
        hwlesson4.task4.Main.printArray(arrayTwo);
        System.out.println(" ");

        for(int i = 0; i < 10; i++){
            arrayThree[i] = arrayOne[i] / arrayTwo[i];
            if(arrayOne[i] % arrayTwo[i] == 0)
                System.out.println(arrayOne[i] + " : " + arrayTwo[i] + " = " + arrayThree[i]);
        }

    }//main ends
}//class ends
