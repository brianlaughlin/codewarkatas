package kata.JavaFunctionalProgramingPart1to4;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionalProgrammingTest {
    @Test
    public void testJohnSmith() throws Exception {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));

  }

  @Test
    public void test2() {
      assertFalse("not a match",
              FunctionalProgramming.f.apply(new Student("Brian", "Jones", "js777")));

  }

}