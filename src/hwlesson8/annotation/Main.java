package hwlesson8.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        /**
         * Придумать и написать собственную аннотацию @Version,
         * которая будет хранить информацию о версии класса сервиса (поле обязательное) MyService
         * и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
         * а кодовое название версии = Nougat).
         *
         * Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию,
         * get и set методы, переопределенные методы equals и hashcode,
         * а так же private метод (private thisClassInfo),
         * который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
         *
         * Написать программу, которая будет анализировать присутствие аннотации над классом MyService
         * и если она присутствует - создавать экземпляр этого класса, задавать значения его полям
         * и вызывать метод thisClassInfo (использовать возможности пакета reflection).
         *
         * */

        MyService myService1 = new MyService();
        myService1.doAction();

        System.out.println("======================================");

        Class<MyService> myServiceClass = MyService.class;
        boolean isAnnotation =  myServiceClass.isAnnotationPresent(Version.class);

        if(isAnnotation){
            MyService myService2 = new MyService(2, Group.SECOND);
            myService2.doAction();
        }
        System.out.println("======================================");

    }//main ends
}//class ends
