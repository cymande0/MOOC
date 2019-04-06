package E25DuplicateRemover;

import java.util.Set;

public interface DuplicateRemover {
    void add(String characterString); //stores a characterString if it's not a duplicate.
    int getNumberOfDetectedDuplicates(); //returns the number of detected duplicates.
    Set<String> getUniqueCharacterStrings();
    void empty(); // removes stored characterStrings and resets the amount of detected duplicates.

}
