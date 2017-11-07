package kata.paginationhelper;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaginationHelperTest {

    List<String> myList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        myList = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p");
    }

    @Test
    public void itemCount() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(16, ph.itemCount());
    }

    @Test
    public void pageCount() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(4, ph.pageCount());
    }

    @Test
    public void pageItemCountNeg() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(-1, ph.pageItemCount(7));
        assertEquals(-1, ph.pageItemCount(-2));
    }

    @Test
    public void pageItemCount1() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(5, ph.pageItemCount(2));
    }

    @Test
    public void pageItemCount2() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(1, ph.pageItemCount(4));
    }


    /*
    Error Test: returning 10 should return 4. test from submission.
    TODO: Test not complete.
     */
    @Test
    public void pageItemCount3() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 4);
        assertEquals(4, ph.pageItemCount(2));
    }


    @Test
    public void pageIndex() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(2, ph.pageIndex(7));
    }

    @Test
    public void pageIndexNeg() throws Exception {
        PaginationHelper<String> ph = new PaginationHelper<>(myList, 5);
        assertEquals(-1, ph.pageIndex(18));
        assertEquals(-1, ph.pageIndex(-2));
    }

}
