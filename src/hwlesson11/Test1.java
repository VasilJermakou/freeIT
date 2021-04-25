package hwlesson11;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {

        File myAdressFile = new File("myAdress.txt");
        try {
            FileReader fileReader = new FileReader(myAdressFile);
            FileWriter fileWriter = new FileWriter("writeFile.txt");

            //read using fileReader
            int i = 0;
            /*
            while ((i = fileReader.read()) != -1 ){
                System.out.print((char)i);
            }*/

            System.out.println("");
            //write using fileWriter
            while ((i = fileReader.read()) != -1 ){
                fileWriter.write(i);
            }

            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }//main ends
}//class ends
