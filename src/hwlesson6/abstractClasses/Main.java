package hwlesson6.abstractClasses;

public class Main {
    public static void main(String[] args) {

        /**
         * Разработать иерархию классов.
         *
         * В классе Транспорт есть поля:
         * - Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг)
         * - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
         * В классе Наземный добавляются поля:
         *  - Количество колёс
         *  - Расход топлива(л/100км)
         * В классе Легковой добавляются поля:
         * - Тип кузова - Кол-во пассажиров
         * В классе Грузовой добавляется  поле:
         * - Грузоподъёмность(т)
         * В классе Воздушный добавляются поля:
         *  - Размах крыльев (м)
         *  - Минимальная длина взлётно-посадочной полосы для взлёта
         * В классе Гражданский добавляются поля:
         *  - Кол-во пассажиров
         *  - Наличие бизнес класса (true/false)
         * В классе Военный  добавляются поля:
         * - Наличие системы катапультирования (true/false) - Кол-во ракет на борту
         *
         * В конечных классах (Легковой, Грузовой, Военный, Гражданский) разработать метод описание
         * который будет возвращать составленную строку с описанием всех характеристик объекта.
         * В строку включить ещё один параметр мощность в киловаттах (кВ) .
         * Расчёт мощности в киловаттах производится в отдельном методе :
         * 1 л.с = 0.74 кВ
         * Для легкового разработать метод который будет принимать время и считать
         * сколько километров проедет машина двигаясь с максимальной скоростью
         * и сколько топлива она израсходует за это время, результат вывести в консоль,
         * расчёт расходуемого топлива вынести в отдельный метод private.
         *
         * Результат работы метода должен вывести такую строчку:
         * За время (ваше введённое время) ч, автомобиль (марка автомобиля)
         * двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
         * проедет (xxx) км  и израсходует (xxx) литров топлива.
         *
         * Мой результат выглядит так:
         * “За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”
         *
         * Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
         * Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
         * если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим
         *  “Вам нужен грузовик побольше ”.
         * Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.
         * Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0
         * то выводим на консоль “ Ракета пошла…”, если 0 то “Боеприпасы отсутствуют”.
         * А так же метод катапультирование, который проверит если наличие системы катапультирования true,
         * то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”.
         * */

        //Passenger car test
        System.out.println("Passenger car object: ");
        PassengerCar car1 = new PassengerCar();
        car1.printObjectCharacteristics();
        car1.maxDistanceCovered(2);

        System.out.println("");

        //Cargo car test
        System.out.println("Cargo car object: ");
        CargoCar cargo1 = new CargoCar();
        cargo1.printObjectCharacteristics();
        cargo1.cargoCarLoading(10000);

        System.out.println("");

        //Civil plane test
        System.out.println("Civil plane object: ");
        CivilAirplane civilAirplane1 = new CivilAirplane();
        civilAirplane1.printObjectCharacteristics();
        civilAirplane1.civilAirplaneLoading(-5);

        System.out.println("");

        //Military plane test
        System.out.println("Military plane object: ");
        MilitaryAirplane militaryAirplane1 = new MilitaryAirplane();
        militaryAirplane1.printObjectCharacteristics();
        militaryAirplane1.shot();
        militaryAirplane1.catapult();

    }//main ends
}//class ends
