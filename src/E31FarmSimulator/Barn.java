package E31FarmSimulator;

import java.util.Collection;

public class Barn {

    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank){
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank(){
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        milkingRobot.setBulkTank(this.bulkTank);
        this.milkingRobot = milkingRobot;
    }

    public void takeCareOf(Cow cow){
        try{
            this.milkingRobot.milk(cow);
        } catch(Exception e){
            throw new IllegalStateException();
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        try{
            for(Cow cow : cows){
                takeCareOf(cow);
            }
        } catch (Exception e){
            throw new IllegalStateException();
        }
    }

    public String toString(){
        return bulkTank.toString();
    }
}


