package hwlesson8.annotation;

public enum Group {
    FIRST(1),
    SECOND(2),
    THIRD(3);

    private int number;

    private Group(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
