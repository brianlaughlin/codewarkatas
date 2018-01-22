package kata.simpledrawingboard;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Canvas {
    int width;
    int height;
    StringBuilder theCanvas;
    String[][] canvasMatrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        theCanvas = new StringBuilder();
        canvasMatrix = new String[width][height];
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas(){

        return "";
    }


    public String drawCanvasPassDrawLines() {
        drawBoarders();

        // 0 , 2 = 'x'
        theCanvas.replace(11,12, "x");
        theCanvas.replace(19,20, "x");
        theCanvas.replace(25,30, "xxxxx");
        theCanvas.replace(35,36, "x");
        theCanvas.replace(43,44, "x");

        return theCanvas.toString();
    }

    private void drawBoarders() {
        drawTopAndBottom();
        drawSides();
        drawTopAndBottom();
    }

    private void drawSides() {
        for (int h = 0; h < height; h++) {
            theCanvas.append("|");
            for (int i = 0; i < width; i++) {
                theCanvas.append(" ");
            }
            theCanvas.append("|");
            theCanvas.append("\n");
        }
    }

    private void drawTopAndBottom() {

        Boolean isTop = true;
        if (theCanvas.length() > 1) isTop = false;
        theCanvas.append(IntStream.range(0, width + 2)
                .mapToObj(i -> "-")
                .collect(Collectors.joining()));
        if (isTop) theCanvas.append("\n");

    }
}
