package hwlesson18.blinovbook.phonebook;

public class Abonent extends Entity{

    /* class fields */
    private String surName;
    private int phoneNumber;

    /* constructors */
    public Abonent(){}

    public Abonent(int id, String surName, int phoneNumber){
        super(id);
        this.surName = surName;
        this.phoneNumber = phoneNumber;

    }

    /* getters and setters */
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /* object methods */
    @Override
    public String toString() {
        return "Abonent{" +
                "id=" + this.getId() +
                ", surName='" + surName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
