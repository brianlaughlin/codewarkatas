package kata.interactivedictionary;

import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> newEntry = new HashMap<>();

    public HashMap<String, String> getNewEntry() {
        return newEntry;
    }

    public void newEntry(String dicWord, String dicDefinition) {
        this.newEntry.put(dicWord, dicDefinition);
    }

    public String look(String dicWord) {
        if (newEntry.get(dicWord) == null)
            return "Can't find entry for " + dicWord;
        else return newEntry.get(dicWord);
    }
}
