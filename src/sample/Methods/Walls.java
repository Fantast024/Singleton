package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;


public class Walls implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(BLACK, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());

        gc.setFill (Color.ORANGERED);
        gc.setStroke (Color.ORANGERED);
        gc.setLineWidth (5);
        gc.fillRoundRect (220, 90, 90, 90, 10, 10);
    }
}
