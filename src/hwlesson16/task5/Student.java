package hwlesson16.task5;

public class Student {

    /* class fields */
    private String name;
    private int group;

    /* constructors */
    public Student(){}

    public Student(String name, int group){
        this.name = name;
        this.group = group;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    /* object method */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
