package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface ImageBuilder {
    public void buildWalls(GraphicsContext gc, Canvas canvas);
    public void buildShaft(GraphicsContext gc, Canvas canvas);
    public void buildWindow(GraphicsContext gc, javafx.scene.canvas.Canvas
            canvas);
    public void buildRoof(GraphicsContext gc, javafx.scene.canvas.Canvas canvas);
    public void buildSun(GraphicsContext gc, javafx.scene.canvas.Canvas canvas);
    public Image getImage();
}