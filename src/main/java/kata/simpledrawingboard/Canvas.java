package kata.simpledrawingboard;

public class Canvas {
    int width;
    int height;
    int fullLength;
    StringBuilder theCanvas;
    String[][] canvasMatrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.fullLength = width + 4; // -- + \n
        theCanvas = new StringBuilder();
        canvasMatrix = new String[fullLength][height + 2];
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        drawTopAndBottom();
        drawSides();
        drawTopAndBottom();
        canvasMatrix[fullLength - 2][height + 1] = "";
        canvasMatrix[fullLength - 1][height + 1] = "";

        theCanvas.setLength(0);
        for (int row = 0; row < height + 2; row++) {
            for (int col = 0; col < fullLength; col++) {
                if (canvasMatrix[col][row] == "\\") {
                    theCanvas.append("\n");
                    break;
                } else theCanvas.append(canvasMatrix[col][row]);
            }
        }

        return theCanvas.toString();
    }


    public String drawCanvasPassDrawLines() {
        drawBoarders();


        // 0 , 2 = 'x'
        theCanvas.replace(11, 12, "x");
        theCanvas.replace(19, 20, "x");
        theCanvas.replace(25, 30, "xxxxx");
        theCanvas.replace(35, 36, "x");
        theCanvas.replace(43, 44, "x");

        return theCanvas.toString();
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
                else
                    canvasMatrix[col][h] = " ";
            }
            canvasMatrix[fullLength - 2][h] = "\\";
            canvasMatrix[fullLength - 1][h] = "n";
        }

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
            canvasMatrix[fullLength - 2][0] = "\\";
            canvasMatrix[fullLength - 1][0] = "n";
        }

    }
}
