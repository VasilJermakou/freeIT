package hwlesson5.additional.task1;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти в строке не только запятые, но и другие знаки препинания.
         * Подсчитать общее их количество.
         * */

        String line = "sdf!#%^poiu}{lkj<>.,/asdqwert";
        punctuationMarksCounter(line);
    }//main ends
    /* static methods */
    public static void punctuationMarksCounter(String line){
        char[] chars = new char[line.length()];
        chars = line.toCharArray();
        int counter = 0;
        int temp = 0;
        for(int i = 0; i < chars.length; i++){
            temp = (int)chars[i];
            if( (temp > 32 && temp < 48) || (temp > 57 && temp < 64) ||
                (temp > 90 && temp < 97) || (temp > 122 && temp < 127) ){
                System.out.println(chars[i]);
                counter++;
            }
        }
        System.out.println("Counter = " + counter);
    }
}//class ends
