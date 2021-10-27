package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shaft implements Item{
    public void draw(GraphicsContext gc, Canvas canvas) {
        gc.setFill (Color.DARKORANGE);
        gc.setStroke (Color.DARKORANGE);
        gc.setLineWidth (3);

        gc.fillRect(230,25,20,50);
    }
}
