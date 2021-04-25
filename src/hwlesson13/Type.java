package hwlesson13;

public enum Type {
    INTERNAL_USE(0),
    EXTERNAL_USE(1);

    private int number;

    private Type(int number){
        this.number = number;
    }
}
