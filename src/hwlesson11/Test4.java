package hwlesson11;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {

        //Using BufferedInputStream & BufferedOutputStream
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\freeIT\\javaBinaryCode.jpg"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("buffOutputStream.jpg"))) {

            int i = 0;
            while ((i = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }//main ends
}//class ends
