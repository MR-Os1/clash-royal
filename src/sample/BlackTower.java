package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

public class BlackTower extends Tower{
    public BlackTower(double x,double y) {
        super(new Polygon(x,y,x-100,y+200,x+100,y+200),1500,300,2);
        this.getShape().setFill(Paint.valueOf("Black"));
    }



}
