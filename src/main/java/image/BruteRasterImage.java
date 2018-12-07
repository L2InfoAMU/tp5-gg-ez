package image;


import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private Color[][] pixels;
    private int width;
    private int height;


    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new Color[width][height];
        for(int i=0;i<width;i++)
            for(int j=0; j<height;j++)
                pixels[i][j]= color;
    }

    public BruteRasterImage(Color[][] pixels) {
        this.pixels = pixels;
        this.width = pixels.length;
        this.height = pixels[0].length;

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
                pixels[i][j] = pixels[i][j]; //erreur revoir
            }
        }
    }

    //change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
    private void setPixelsColor(Color color) {
        this.pixels[this.width][this.height] = color;
    }

    // retourne la largeur de l’image.
    public int getWidth() {
        return this.width;
    }

    // retourne la hauteur de l’image.
    public int getHeight() {
        return this.height;
    }

    // fixe la largeur de l’image.
    protected void setWidth(int width) {
        this.width = width;
    }

    //fixe la hauteur de l’image.
    protected void setHeight(int height) {
        this.height = height;
    }
}