package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class BlueTower extends Tower{

    public BlueTower(double x,double y) {
        super(new Rectangle(x,y,100,75),1500,250,3);
        this.getShape().setFill(Paint.valueOf("Blue"));
    }
}
