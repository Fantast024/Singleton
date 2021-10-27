package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class Roof implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        gc.setFill (Color.GREEN);
        gc.setStroke (Color.GREEN);
        gc.setLineWidth (5);

        double[] x = {205, 265, 325};
        double[] y = {90, 35, 90};

        gc.fillPolygon(x, y, x.length);
    }
}
