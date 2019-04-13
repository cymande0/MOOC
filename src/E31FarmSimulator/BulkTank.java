package E31FarmSimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getVolume(){
        return volume;
    }

    public double howMuchFreeSpace(){
        return capacity - volume;
    }

    public void addToTank(double amount){
        if(amount > (capacity - volume)){
            volume = capacity;
        }
        else{
            volume += amount;
        }
    }

    public double getFromTank(double amount){
        if (amount > volume){
            volume = 0;
            return volume;
        }
        else {
            volume -= amount;
            return amount;
        }
    }

    public String toString(){
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }


}
