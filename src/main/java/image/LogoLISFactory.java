package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LogoLISFactory implements ImageFactory{
    @Override
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        Color greenblue = Color.rgb(113,208,199);

        int[] xCoordinates = {0,  40, 350, 350, 550,  600,780,600};
        int[] yCoordinates = {360, 360, 100, 360,200,   80, 360,360};
        int[] widths =       {80, 200, 100, 100,  100, 300,  100,200};
        int[] heights =      {360, 80,  140, 220,  300, 100, 200,80};
        Color[] colors = {Color.BLACK, Color.BLACK, greenblue, Color.BLACK , Color.BLACK, Color.BLACK,  Color.BLACK, Color.BLACK};

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i<colors.length; i++)
            list.add(new Rectangle(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i]));

        return new VectorImage(list, 860, 340);
    }
}