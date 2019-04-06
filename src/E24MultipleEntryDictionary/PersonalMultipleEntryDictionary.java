package E24MultipleEntryDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set<String>> dictonary;

    public PersonalMultipleEntryDictionary(){
        this.dictonary = new HashMap<>();
    }

    @Override
    public void add(String word, String entry) {

        if(!this.dictonary.containsKey(word)) {
            dictonary.put(word, new HashSet<String>());
        }

        Set<String> translatedWord = dictonary.get(word);
        translatedWord.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return dictonary.get(word);
    }

    @Override
    public void remove(String word) {
        if(dictonary.containsKey(word)){
            dictonary.remove(word);
        }
    }
}
