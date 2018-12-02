package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

import static util.Matrices.*;

public class PaletteRasterImage implements Image {

    private int width;
    private int height;
    private List<Color> palette;
    private int [][] indexesOfColors;

    // Les deux constructeurs

    //Constructeur 1
    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        palette.add(color);
        setPixelsColor(color);
    }

    //Constructeur 2
    public PaletteRasterImage(Color[][] pixels){
        this.height = getColumnCount(pixels);
        this.width = getRowCount(pixels);
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        createRepresentation();
        setPixelsColor(pixels);
    }

    // Les 9 méthodes qui implémentent la classe PaletteRasterImage

    //methode 1
    public void createRepresentation(){
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[width][height];
    }

    //methode 2
    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    //methode 3

    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    //methode 4
    public void setPixelsColor(Color[][] pixels){
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                palette.add(pixels[x][y]);
                indexesOfColors[x][y] = palette.indexOf(pixels[x][y]);
            }
        }
    }

    //methode 5
    private void setPixelsColor(Color color){
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                indexesOfColors[x][y] = palette.indexOf(color);
    }

    //methode 6
    public int getWidth() {
        return width;
    }

    //methode 7
    public int getHeight(){
        return height;
    }

    //methode 8
    protected void setWidth(int width){
        this.width = width;

    }

    //methode 9
    protected void setHeight (int height){
        this.height = height;
    }
}
