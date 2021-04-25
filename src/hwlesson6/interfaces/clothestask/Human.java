package hwlesson6.interfaces.clothestask;

import java.util.Objects;

public class Human {

    /* class fields */
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IFootWear footWear;

    /* constructor */
    public Human(String name, IJacket jacket, IPants pants, IFootWear footWear){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.footWear = footWear;
    }

    /* getters */
    public String getName() {
        return name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public IFootWear getFootWear() {
        return footWear;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(jacket, human.jacket) && Objects.equals(pants, human.pants) && Objects.equals(footWear, human.footWear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jacket, pants, footWear);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", jacket=" + jacket +
                ", pants=" + pants +
                ", footWear=" + footWear +
                '}';
    }

    /* methods */
    public void getDressed(){
        this.jacket.getDressed();
        this.pants.getDressed();
        this.footWear.getDressed();
    }

    public void unDress(){
        this.jacket.unDress();
        this.pants.unDress();
        this.footWear.unDress();
    }
}//class ends
