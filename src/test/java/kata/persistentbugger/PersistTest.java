package kata.persistentbugger;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersistTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void Test1(){
        assertEquals(3, Persist.persistence(39));
    }
}