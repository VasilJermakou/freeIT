package hwlesson8.annotation;

import java.util.Objects;

@Version(versionNumber = 1.2, versionName = "beta-test-one")
public class MyService {

    /* class fields */
    private int id;
    private Group group;

    /* constructors */
    public MyService(){
        this.id = 1;
        this.group = Group.FIRST;
        thisClassInfo();
    }

    public MyService(int id, Group group){
        this.id = id;
        this.group = group;
        thisClassInfo();
    }

    /* getters & setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && group == myService.group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group);
    }

    /* methods */
    private void thisClassInfo(){
        System.out.print("MyService = {");
        System.out.print("id: " + this.id + ", ");
        System.out.print("group: " + this.group + "}");
        System.out.println("");
    }

    public void doAction(){
        Class<MyService> ms = MyService.class;
        Version version = ms.getAnnotation(Version.class);
        System.out.print("Version name: " + version.versionName() + ", ");
        System.out.println("version number " + version.versionNumber());
    }
}//class ends
