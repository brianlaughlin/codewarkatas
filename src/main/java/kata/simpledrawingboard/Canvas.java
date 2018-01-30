package kata.simpledrawingboard;

import java.util.stream.IntStream;

public class Canvas {
    private int width;
    private int height;
    private int fullLength;
    private StringBuilder theCanvas;
    private String[][] canvasMatrix;

    public Canvas(int width, int height) throws IllegalArgumentException {
        if (width < 1 || height < 1) throw new IllegalArgumentException();

        this.width = width;
        this.height = height;
        this.fullLength = width + 4;
        theCanvas = new StringBuilder();
        canvasMatrix = new String[fullLength][height + 2];
    }

    public Canvas draw(int x1, int y1, int x2, int y2) throws IllegalArgumentException {

        if (x1 > height || x1 < 0) throw new IllegalArgumentException();
        if (x2 > height || x2 < 0) throw new IllegalArgumentException();
        if (y1 > width || y1 < 0) throw new IllegalArgumentException();
        if (y2 > width || y2 < 0) throw new IllegalArgumentException();

        if (y1 == y2) drawVertical(x1, y1, x2);
        else if (x1 == x2) drawHorizontal(x1, y1, y2);
        else {
            drawRectangle(x1, y1, x2, y2);
        }

        return this;
    }

    private void drawRectangle(int x1, int y1, int x2, int y2) {
        drawVertical(x1, y1, x2 - 1);
        drawVertical(x1, y2 + 1, x2 - 1);
        drawHorizontal(x1, y1, y2 + 1);
        drawHorizontal(x2 - 1, y1, y2 + 1);
    }

    private void drawHorizontal(int x1, int y1, int y2) throws ArrayIndexOutOfBoundsException {
        IntStream.rangeClosed(y1 + 1, y2 + 1)
                .forEachOrdered(col -> canvasMatrix[col][x1 + 1] = "x");
    }

    private void drawVertical(int x1, int y1, int x2) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        try {
            IntStream.rangeClosed(x1 + 1, x2 + 1)
                    .forEachOrdered(row -> canvasMatrix[y1 + 1][row] = "x");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public Canvas fill(int x, int y, char ch) throws IllegalArgumentException {

        if (x < 0 || x > height) throw new IllegalArgumentException();
        if (y < 0 || y > width) throw new IllegalArgumentException();

        if (canvasMatrix[x][y] == null) {
            canvasMatrix[x][y] = String.valueOf(ch);
            fill(x + 1, y, ch);
            fill(x - 1, y, ch);
            fill(x, y + 1, ch);
            fill(x, y - 1, ch);
        }

        return this;
    }

    public String drawCanvas() {
        drawBoarders();
        canvasMatrix[fullLength - 2][height + 1] = "";
        canvasMatrix[fullLength - 1][height + 1] = "";

        canvasToString();

        return theCanvas.toString();
    }

    private void canvasToString() {
        theCanvas.setLength(0);
        for (int row = 0; row < height + 2; row++) {
            for (int col = 0; col < fullLength; col++) {
                if (canvasMatrix[col][row].equals("\\")) {
                    theCanvas.append("\n");
                    break;
                } else theCanvas.append(canvasMatrix[col][row]);
            }
        }
    }


    private void drawBoarders() {
        drawTopAndBottom();
        drawSides();
        drawTopAndBottom();
    }

    private void drawSides() {
        for (int h = 1; h < height + 1; h++) {
            for (int col = 0; col <= fullLength - 2; col++) {
                if (col == 0 || col == (fullLength - 3))
                    canvasMatrix[col][h] = "|";
                else if (canvasMatrix[col][h] == null)
                    canvasMatrix[col][h] = " ";
            }
            addReturn(fullLength, h);
        }

    }

    private void addReturn(int fullLength, int h) {
        canvasMatrix[fullLength - 2][h] = "\\";
        canvasMatrix[fullLength - 1][h] = "n";
    }

    private void drawTopAndBottom() {

        Boolean isTop = true;
        int row = 0;

        if (canvasMatrix[0][0] == "-") isTop = false;
        if (!isTop) row = height + 1;
        for (int i = 0; i < fullLength - 2; i++) {
            canvasMatrix[i][row] = "-";
        }
        if (isTop) {
            addReturn(fullLength, 0);
        }
    }
}
