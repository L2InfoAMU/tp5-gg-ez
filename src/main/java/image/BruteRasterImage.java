package image;


import javafx.scene.paint.Color;

public class BruteRasterImage extends RasterImage implements Image  {
    private Color[][] pixels;


    public BruteRasterImage(Color color, int width, int height) {
        super(width, height);
        pixels = new Color[width][height];
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                pixels[i][j] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] pixels) {
        super(pixels.length,pixels[0].length);
        this.pixels = pixels;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                this.pixels[i][j]=pixels[i][j];
    }

    //alloue la matrice représentant l’image.
    public void createRepresentation() {
        pixels = new Color[getWidth()][getHeight()];
    }

    //fixe la couleur d’un pixel.
    public void setPixelColor(Color color, int x, int y) {
        this.pixels[x][y] = color;
    }

    //retourne la couleur d’un pixel.
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    //met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre.
    private void setPixelsColor(Color[][] pixels) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                pixels[i][j] = pixels[i][j];
            }
        }
    }

    //change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
    private void setPixelsColor(Color color) {
        this.pixels[this.width][this.height] = color;
    }

}