package E32DiffrentBoxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

    private List<Thing> things;
    private int maxWeight;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void add(Thing thing){
        if(thing.getWeight() > this.maxWeight){
            throw new IllegalStateException();
        }
        things.add(thing);
    }

    public boolean isInTheBox(Thing thing){
        if(things.contains(thing)){
            return true;
        }
        return false;
    }
}
