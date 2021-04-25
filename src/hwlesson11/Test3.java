package hwlesson11;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {

        //using BufferedReader & BufferedWriter
        File adressfile = new File("myAdress.txt");
        String line = null;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(adressfile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffWriter.txt"));) {

            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

            System.out.println("Done!");

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }//main ends
}//class ends
