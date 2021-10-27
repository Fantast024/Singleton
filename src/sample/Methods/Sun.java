package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Sun implements Item{

    @Override
    public void draw(GraphicsContext gc, Canvas canvas) {
        gc.setFill (Color.RED);
        gc.setStroke (Color.RED);
        gc.setLineWidth (5);
        gc.fillOval(540,10,50,50);

        gc.beginPath();
        gc.moveTo(520,40);
        gc.lineTo(470,47);
        gc.stroke();

        gc.beginPath();
        gc.moveTo(535,70);
        gc.lineTo(500,110);
        gc.stroke();

        gc.beginPath();
        gc.moveTo(570,75);
        gc.lineTo(577,120);
        gc.stroke();
    }
}
