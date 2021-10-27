package sample.Methods;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class SimpleImageBuilder implements ImageBuilder {
    private Image image;
    public SimpleImageBuilder(){
        this.image = new Image();
    }
    public void buildWalls(GraphicsContext gc, Canvas canvas) {
        this.image.setWalls(new Walls());
        this.image.drawWalls(gc,canvas);
    }

    public void buildShaft(GraphicsContext gc, Canvas canvas) {
        this.image.setShaft(new Shaft());
        this.image.drawShaft(gc,canvas);
    }

    public void buildWindow(GraphicsContext gc, Canvas canvas) {
        this.image.setWindow(new Window());
        this.image.drawWindow(gc,canvas);
    }
    public void buildRoof(GraphicsContext gc, Canvas canvas) {
        this.image.setRoof(new Roof());
        this.image.drawRoof(gc,canvas);
    }

    public void buildSun(GraphicsContext gc, Canvas canvas){
        this.image.setSun(new Sun());
        this.image.drawSun(gc,canvas);
    }

    public Image getImage() {
        return this.image;
    }
}