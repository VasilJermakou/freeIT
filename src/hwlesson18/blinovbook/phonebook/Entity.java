package hwlesson18.blinovbook.phonebook;

import java.io.Serializable;

public class Entity implements Serializable, Cloneable {

    /* class fields */
    private int id;

    /* constructor */
    public Entity(){}

    public Entity(int id){
        this.id = id;
    }

    /* getter and setter */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /* object methods*/
    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }
}
