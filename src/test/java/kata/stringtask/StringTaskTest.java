package kata.stringtask;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTaskTest {


    @Test
    public void perform() throws Exception {
        assertEquals( ".t.r", StringTask.perform( "tour" ) );
        assertEquals( ".c.d.w.r.s", StringTask.perform( "Codewars" ) );
        assertEquals( ".b.c.b", StringTask.perform( "aBAcAba" ) );
    }

    @Test
    public void test1() {
        assertEquals( ".t.r", StringTask.perform( "tour" ) );
    }
}