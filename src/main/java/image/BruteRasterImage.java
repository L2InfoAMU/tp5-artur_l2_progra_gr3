package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private Color color;
    private int width;
    private int height;
    private Color[][]colors;

    //Premier constructeur d'objet de type BruteRasterImage
    public BruteRasterImage(Color color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //Second constructeur d'objet de type BruteRasterImage
    public BruteRasterImage(Color[][] colors){
        this.colors = colors;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
