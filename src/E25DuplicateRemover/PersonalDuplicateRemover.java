package E25DuplicateRemover;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {


    private Set <String> setList;
    private int amountOfDuplicate;

    public PersonalDuplicateRemover(){
        this.setList = new HashSet<>();
        this.amountOfDuplicate = 0;
    }

    @Override
    public void add(String characterString){
        if(setList.contains(characterString)){
            amountOfDuplicate++;
        }
        setList.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates(){
        return amountOfDuplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings(){
        return setList;
    }

    @Override
    public void empty(){
        amountOfDuplicate = 0;
        setList.removeAll(setList);
    }
}
