package E30Container;

public class Container {

    private double capacity;
    private double currentCapacity;
    private double volume;

    public Container(double capacity){
        this.capacity = capacity;
        this.currentCapacity = capacity;
        this.volume = 0;
    }

    public double getVolume(){
        return volume;
    }

    public double getOriginalCapacity(){
        return capacity;
    }

    public double getCurrentCapacity(){
        return currentCapacity;
    }

    public void addToTheConteiner(double amount){
//        TODO
//        if(currentCapacity >= amount) {
//            currentCapacity = capacity - amount;
//            volume = capacity - currentCapacity;
//        }
    }

    public double takeFromTheContainer(double amount){
//        TODO
//        if(capacity >= currentCapacity + amount) {
//            currentCapacity += amount;
//            volume -= amount;
//        }
    }

    public String toString(){
        return "voule = " + getVolume() + ", free space  = " + getCurrentCapacity();
    }


}
