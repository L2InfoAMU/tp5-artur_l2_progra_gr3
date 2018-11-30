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
        this.palette = new ArrayList<Color>();
        this.indexesOfColors = new int[width][height];
        palette.add(color);
        for(int x = 0; x < height; x++)
            for(int y = 0; y < width; y++)
                indexesOfColors[y][x] = palette.indexOf(color);
    }

    //Constructeur 2
    public PaletteRasterImage(Color[][] pixels){
        this.height = getColumnCount(pixels);
        this.width = getRowCount(pixels);
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        this.palette = new ArrayList<Color>();
        this.indexesOfColors = new int[width][height];
        for(int x = 0; x < height; x++)
            for (int y = 0; y < width; y++)
                indexesOfColors[y][x] = palette.indexOf(pixels[y][x]);
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
