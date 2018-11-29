package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    private int width;
    private int height;
    private Color[][]colors;

    // Les deux constructeurs

    //Constructeur 1
    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        for(int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                colors[x][y] = color;
            }
        }
    }

    //Contructeur 2 -> TODO : la construire corretement
    public PaletteRasterImage(Color[][] pixels){
        this.colors = pixels;
    }

    //Les neufs methodes

    //methode 1
    public void createRepresentation(){
        this.colors = new Color[width][height];
    }

    //methode 2
    public void setPixelColor(Color color, int x, int y){
        //TODO : verifier si color n'est pas dans la palette de couleur si elle ne l'est pas alors l'ajouter
        colors[x][y] = color;
    }


    //methode 3
    public void setPixelsColor(Color[][] pixels){
        this.colors = pixels;
    }

    //methode 4
    private void setPixelsColor(Color color){
        for(int x = 0; x < height; x++)
            for(int y = 0; y < width; y++)
                colors[x][y] = color;
    }

    //methode 5
    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    //methode 6
    @Override
    public int getWidth() {
        return colors[0].length;
    }

    //methode 7
    @Override
    public int getHeight() {
        return colors.length;
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
