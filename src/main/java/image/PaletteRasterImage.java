package image;

public class PaletteRasterImage implements Image {
    List<Color> palette;
    private int width;
    private int height;
    private int[][] indexOfColors;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                this.setPixelColor(color, i, j);
    }

    public PaletteRasterImage(Color[][] pixels) {
        this.width = pixels.length;
        this.height = pixels[0].length;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                this.setPixelColor(pixels[i][j], i, j);
    }

    public void createRepresentation() {
        indexOfColors = new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color))
            palette.add(color);
        indexOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        /* probleme de type a corriger*/
        return indexOfColors[x][y];
    }

    public void setPixelsColor(Color[][] pixels) {
        indexOfColors[][] = pixels;
    }

    private void setPixelsColor(Color color) {
        indexOfColors=color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}