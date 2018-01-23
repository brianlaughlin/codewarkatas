package kata.simpledrawingboard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanvasTest {
    @Test
    public void drawLines() {
        Canvas c = new Canvas(5, 5);
        c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
        assertEquals("-------\n|  x  |\n|  x  |\n|xxxxx|\n|  x  |\n|  x  |\n-------", c.drawCanvas());
    }

    @Test
    public void drawRectangle() {
        Canvas c = new Canvas(7, 7);
        c.draw(1, 1, 5, 4);
        assertEquals("---------\n|       |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
    }

    @Test
    public void fill() {
        Canvas c = new Canvas(7, 7);
        c.draw(1, 1, 5, 4).fill(3, 3, 'o');
        assertEquals("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
    }

    @Test
    public void emptyCanvas(){
        Canvas c = new Canvas(4, 2);
        assertEquals("------\n|    |\n|    |\n------", c.drawCanvas());
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidCanvasHeight(){
        Canvas c = new Canvas(63, -10);

    }

    @Test(expected = IllegalArgumentException.class)
    public void drawOutOfBoundsWH(){
        Canvas c = new Canvas(80, 80);
        c.draw(160,170,160,170);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fillOutOfBoundsH(){
        Canvas c = new Canvas(30, 40);
        c.fill(10,200, 'o');
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void mixedDrawing(){
        Canvas c = new Canvas(20, 4);
        c.draw(0,1, 5,1);

//        assertEquals("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());

    }

    @Test(expected = IllegalArgumentException.class)
    public void moreRandom(){
        Canvas c = new Canvas(38, 34);
        c.draw(4,16,13,24).draw(12,20,22,12)
        .draw(18,31,11,32).draw(32,17,2,10)
        .draw(33, 29, 20, 5).draw(31, 31, 21, 14)
        .draw(8,10,31,20).draw(3,5,25,28)
        .draw(27,19,34,30).draw(1,7,25,27)
        .draw(1,19,31,27).draw(19,27,27,0)
        .draw(15,18,30,33).draw(6,12,24,6)
        .draw(28,8,30,10).draw(33,12,5,2)
        .fill(3,16,'a');

        assertEquals("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());

    }


    @Test
    public void drawRectangleWithFill() {
        Canvas c = new Canvas(17, 17);
        c.draw(1, 1, 5, 4).fill(8,3, 'A');
        assertEquals("---------\n|    x   |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
    }
}