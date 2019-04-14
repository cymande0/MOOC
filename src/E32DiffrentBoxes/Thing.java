package E32DiffrentBoxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name){
        this(name, 0);
    }

    public Thing(String name, int weight){
        this.name = name;
        if(weight < 0){
            throw new IllegalStateException();
        }
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Thing thing = (Thing) o;
//        return weight == thing.weight &&
//                Objects.equals(name, thing.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, weight);
//    }
}
