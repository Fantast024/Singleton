package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Image {
    private Sun sun;
    private Shaft shaft;
    private Window window;
    private Roof roof;
    private Walls walls;
    public void setShaft(Shaft shaft) {
        this.shaft = shaft;
    }
    public void setWindow(Window window) {
        this.window = window;
    }
    public void setRoof(Roof roof) {
        this.roof = roof;
    }
    public void setWalls(Walls walls) {
        this.walls = walls;
    }
    public void setSun(Sun sun){
        this.sun = sun;
    }
    public void drawShaft(GraphicsContext gc, Canvas canvas){
        shaft.draw(gc,canvas);
    }
    public void drawWindow(GraphicsContext gc, Canvas canvas){
        window.draw(gc,canvas);
    }
    public void drawRoof(GraphicsContext gc, Canvas canvas){
        roof.draw(gc,canvas);
    }
    public void drawWalls(GraphicsContext gc, Canvas canvas){
        walls.draw(gc,canvas);
    }
    public void drawSun(GraphicsContext gc, Canvas canvas){
        sun.draw(gc,canvas);
    }
}