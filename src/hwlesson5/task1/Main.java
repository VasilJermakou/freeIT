package hwlesson5.task1;

public class Main {

    public static void main(String []args){

        /**
         Вырезать подстроку из строки начиная с первого вхождения символа(А)
         до последнего вхождения символа(В).
         */


        System.out.println("*****************");
        String line = "abcdefghij";
        String output = subLine(line, 'c', 'g');
        System.out.println(output);
        System.out.println("*****************");


    }//main ends

    /* static methods */
    public static String subLine(String line, char charFrom, char charTo){
        char[] chars = new char[line.length()];
        chars = line.toCharArray();
        int startIndex = 0;
        int endIndex = 0;
        StringBuilder sb = new StringBuilder("");
        String result = "";

        //check first and last entrance
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == charFrom)
                startIndex = i;

            if(chars[i] == charTo)
                endIndex = i;
        }

        //make subline
        for(int i = startIndex; i <= endIndex; i++){
            sb.append(chars[i]);
        }

        result = sb.toString();

        return result;
    }//method ends

}//class ends
