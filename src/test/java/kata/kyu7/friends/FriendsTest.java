package kata.kyu7.friends;

import org.junit.Assert;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FriendsTest {

    @Test
    public void testFriends() throws Exception {
        int result = Friends.friends(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldWorkForExampleTestCases() {
        assertEquals(0, Friends.friends(0));
        assertEquals(0, Friends.friends(1));
        assertEquals(0, Friends.friends(2));
        assertEquals(1, Friends.friends(4));
        assertEquals(1, Friends.friends(3));
        assertEquals(6, Friends.friends(16));
    }
}