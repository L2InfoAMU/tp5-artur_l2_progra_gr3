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

    //Les neufs méthodes de la classe

    //Alloue la matrice représentant l'image
    public void createRepresentation(){

    }

    //Fixe la couleur d'un pixel
    public void setPixelColor(Color color, int x, int y){
        colors[x][y] = color;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    //met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre
    private void setPixelsColor(Color [][] pixels){
        this.colors = pixels;
    }

    //les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre
    private void setPixelsColor(Color color){
        for(int x = 0; x < height; x++)
            for(int y = 0; y < width; y++)
                colors[x][y] = color;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}
