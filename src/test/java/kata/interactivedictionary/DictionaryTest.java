package kata.interactivedictionary;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {

    Dictionary dictionary = new Dictionary();


    @Test
    public void getNewEntry() throws Exception {
    }

    @Test
    public void setNewEntry() throws Exception {
        dictionary.newEntry("Apple","Red juicy fruit");
    }

    @Test
    public void look() throws Exception {
        dictionary.newEntry("Apple","Red juicy fruit");
        System.out.println(dictionary.look("Apple"));
    }

    @Test
    public void lookNotFound() throws Exception {
        dictionary.newEntry("Apple","Red juicy fruit");
        System.out.println(dictionary.look("Orange"));
    }

}