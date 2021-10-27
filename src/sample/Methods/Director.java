package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Director {
    public void build(ImageBuilder builder, GraphicsContext gc, Canvas canvas){
        builder.buildWalls(gc, canvas);
        builder.buildRoof(gc, canvas);
        builder.buildShaft(gc, canvas);
        builder.buildWindow(gc, canvas);
        builder.buildSun(gc, canvas);
    }
}
