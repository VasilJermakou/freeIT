package hwlesson11.additional.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /**
         *  Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
         * сериализации произвести обратный процесс
         * */

        Car car1 = new Car("Skoda", 200, 14000);
        System.out.println(car1.toString());

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("car.bin"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("car.bin"))) {

            objectOutputStream.writeObject(car1);

            Car car2 = (Car)objectInputStream.readObject();
            System.out.println(car2.toString());

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//main ends
}//class ends
