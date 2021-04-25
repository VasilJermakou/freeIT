package hwlesson11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {

        //using FileInputStream & FileOutputStream
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\freeIT\\javaBinaryCode.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("java-binary.jpg");

            int i = 0;
            while ((i = fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }
            System.out.println("Done!");

            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }//main ends
}//class ends