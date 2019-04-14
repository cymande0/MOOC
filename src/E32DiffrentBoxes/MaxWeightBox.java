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
        int weightBox = 0;
        for (Thing t : things) {
            weightBox += t.getWeight();
        }
        if (weightBox + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing){
        return things.contains(thing);
    }
}
