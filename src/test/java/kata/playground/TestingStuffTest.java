package kata.playground;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class TestingStuffTest {

    public TestingStuff t = new TestingStuff();

    @Test
    public void webBrowserTest() throws IOException, URISyntaxException {
        TestingStuff.webBrowser();
    }

}