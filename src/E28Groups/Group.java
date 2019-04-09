package E28Groups;

import java.util.ArrayList;

public class Group implements Moveble {

    private ArrayList <Moveble> group;

    public Group(){
        this.group = new ArrayList<>();
    }

    public void addToGroup(Moveble moveble){
        group.add(moveble);
    }

    public String toString(){
        String result = "";
        for(Moveble organism : group){
            result += organism;
            result += '\n';
        }
        return result;
    }

    @Override
    public void move(int dx, int dy) {
        for(Moveble organism : group){
            organism.move(dx, dy);
        }
    }
}
