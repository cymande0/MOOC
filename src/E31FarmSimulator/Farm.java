package E31FarmSimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private List<Cow> cowsList;
    private String nameOwner;
    private Barn farmBarn;

    public Farm(String nameOwner, Barn barn) {
        this.nameOwner = nameOwner;
        this.farmBarn = barn;
        this.cowsList =  new ArrayList<Cow>();
    }

    public String getOwner() {
        return nameOwner;
    }

    public void addCow(Cow cow){
        cowsList.add(cow);
    }

    public String toString() {
        if (cowsList.size() == 0) {
            return "Barn bulk tank: " + farmBarn.toString() + "\nNo cows";
        }
        String output = "Animals:\n\t";
        for(Cow cow : cowsList){
            output += (cow.toString() + "\n\t");
        }
        return output;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        farmBarn.installMilkingRobot(milkingRobot);
    }

    public void manageCows(){
        farmBarn.takeCareOf(cowsList);
    }

    @Override
    public void liveHour(){
        for(Cow cow : cowsList){
            cow.liveHour();
        }
    }
}
