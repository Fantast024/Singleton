package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import static javafx.scene.paint.Color.*;

public class Window implements Item {
    public void draw(GraphicsContext gc, Canvas canvas) {
        Parameters_Singleton singleton =
                Parameters_Singleton.getInstance(BLACK, 4);
        gc.setFill(singleton.getColor());
        gc.setLineWidth(singleton.getLineWidth());

        gc.setFill (Color.BLACK);
        gc.setStroke (Color.BLACK);
        gc.setLineWidth (5);
        gc.strokeOval(248,110,35,35);
        gc.setFill(Color.WHITE);
        gc.fillArc(252, 114, 25, 27, 90, 180, ArcType.OPEN);
        gc.fillArc(254, 114, 25, 27, 270, 180, ArcType.OPEN);

    }
}
