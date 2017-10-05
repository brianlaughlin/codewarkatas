package kata.buildingblocks;

public class Block {
    int width = 0;
    int length = 0;
    int height = 0;
    int volume = 0;
    int surfaceArea = 0;

    public Block(int[] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        volume = width * length * height;
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSurfaceArea() {
        surfaceArea = (2* width * length) + (2 * length * height) + (2 * width * height);
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
}

class BlockBest{
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surface_area;

    // Constructor
    public BlockBest(int[] params) {
        width = params[0];
        length = params[1];
        height = params[2];

        volume = width * length * height;
        surface_area = 2 * (width * length + width * height + length * height);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return surface_area;
    }
}