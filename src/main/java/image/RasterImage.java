package image;
import javafx.scene.paint.Color;

public abstract class RasterImage implements  Image{
    /*on mes les champs en protected pour que les classes filles puissent les manipuler*/
    protected int width;
    protected  int height;
    protected Color[][]colors;



}
