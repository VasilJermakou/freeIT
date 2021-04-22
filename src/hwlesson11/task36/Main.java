package hwlesson11.task36;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
         * должны быть распечатаны отдельно.
         * */

        File fileDirectory = new File("D:\\freeIT\\togit\\freeIT\\src\\hwlesson11");

        System.out.println("print files");
        File[] fl = fileDirectory.listFiles();
        for(File f : fl){
            if(f.isFile())
                System.out.println(f);
        }

        System.out.println("print directories");
        for(File f : fl){
            if(f.isDirectory())
                System.out.println(f);
        }
    }//main ends
}//class ends
