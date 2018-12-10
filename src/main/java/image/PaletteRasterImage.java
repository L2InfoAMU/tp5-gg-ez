package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {
    List<Color> palette;
    private int[][] indexOfColors;

    public PaletteRasterImage(Color color, int width, int height) {
        super(width,height);
        this.createRepresentation();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                setPixelColor(color, i, j);
            }
        }
    }
    public PaletteRasterImage(Color[][] pixels) {
        super(pixels.length,pixels[0].length);
        this.createRepresentation();
        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                this.setPixelColor(pixels[i][j], i, j);
    }

    public void createRepresentation() {
        palette = new ArrayList<Color>() ;
        indexOfColors = new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color))
            palette.add(color);
        indexOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        if(pixels.length!=width || pixels[0].length!=height)
            throw new ArithmeticException("La taille des tableaux ne correpondent pas");
        for(int i=0 ; i < width ; i++) {
            for (int j = 0; j < height; j++) {
                this.setPixelColor( pixels[i][j],i,j);
            }
        }
    }

    private void setPixelsColor(Color color) {
        for(int i=0 ; i < width ; i++) {
            for (int j = 0; j < height; j++) {
                this.setPixelColor( color,i,j);
            }
        }
    }


}
