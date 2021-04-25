package hwlesson6.interfaces.robottask;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
         * Класс SonyHead является примером реализацией головы от Sony.
         * Создайте 3 робота с разными комплектующими.
         * Например у робота голова и нога от Sony а, рука от Samsung.
         * У всех роботов вызовите метод action.
         * Среди 3-х роботов найдите самого дорогого.
         * */

        IRobot robot1 = new Robot1(new SonyHead(), new SonyHand(), new SonyLeg());
        IRobot robot2 = new Robot1(new ToshibaHead(), new ToshibaHand(), new ToshibaLeg());
        IRobot robot3 = new Robot1(new SamsungHead(), new SamsungHand(), new SamsungLeg());

        IRobot[] robots = new IRobot[3];
        robots[0] = robot1;
        robots[1] = robot2;
        robots[2] = robot3;

        for(IRobot robot : robots)
            robot.action();

        robotMaxPrice(robots);

    }//main ends

    /* static methods */
    public static void robotMaxPrice(IRobot[] robots){
        int maxPrice = robots[0].getPrice();
        int index = 0;
        for(int i = 0; i < robots.length; i++){
            if(maxPrice < robots[i].getPrice()){
                maxPrice = robots[i].getPrice();
                index = i;
            }
        }
        System.out.println("Robot at index " + index + " has maxPrice: " + maxPrice);
    }
}//class ends
