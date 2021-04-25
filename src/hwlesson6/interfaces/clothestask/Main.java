package hwlesson6.interfaces.clothestask;

public class Main {
    public static void main(String[] args) {

        /**
         * Интерфейсы:
         * - Куртка
         * - Штаны
         * - Обувь
         * в каждом интерфейсе есть 2 метода (надеть и снять)
         * Делаем несколько реализации каждого интерфейса.
         * Создаём класс человек:
         * У человека поля:
         * -имя
         * -куртка
         * -штаны
         * -обувь
         * У человека есть 2 метода:
         * - одеться(вызываются методы надеть у всех вещей)
         * - раздеться (вызываются методы снять у всех вещей)
         * */

        Human human1 = new Human("Abraham", new AdidasJacket(), new AdidasPants(), new AdidasFootWear());
        Human human2 = new Human("Lincoln", new NikeJacket(), new NikePants(), new NikeFootWear());

        System.out.println("this is " + human1.getName());
        human1.getDressed();
        human1.unDress();

        System.out.println("");

        System.out.println("This is " + human2.getName());
        human2.getDressed();
        human2.unDress();

    }//main ends
}//class ends
