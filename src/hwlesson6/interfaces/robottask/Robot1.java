package hwlesson6.interfaces.robottask;

import java.util.Objects;

public class Robot1 implements IRobot{

    /* class fields */
    private IHead head;
    private IHand hand;
    private ILeg leg;

    /* constructor */
    public Robot1(IHead head, IHand hand, ILeg leg){
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    /* getters */
    public IHead getHead() {
        return head;
    }

    public IHand getHand() {
        return hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot1 robot1 = (Robot1) o;
        return Objects.equals(head, robot1.head) && Objects.equals(hand, robot1.hand) && Objects.equals(leg, robot1.leg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, hand, leg);
    }

    @Override
    public String toString() {
        return "Robot1{" +
                "head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                '}';
    }

    /* methods */
    @Override
    public void action() {
        this.head.speak();
        this.hand.handUp();
        this.leg.step();
    }

    @Override
    public int getPrice() {
        return this.head.getPrice() + this.hand.getPrice() + this.leg.getPrice();
    }
}//class ends
