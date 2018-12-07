package image;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.ArrayList;

public class VectorImage implements Image {
    private int width;
    private int height;
    private List<Shape> shape;

    //Constructeur
    public VectorImage(List<Shape> shapes, int width, int height){
        this.height=height;
        this.width = width;
        this.shape= new ArrayList<>();
        shape = shapes;
    }

    //Les 5 methodes
    @Override
    public Color getPixelColor(int x, int y) {
        for(Shape c:shape){
            if(c.contains(new Point(x,y)))
                return c.getColor();
        }
        return Color.RED;
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
