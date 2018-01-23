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
}