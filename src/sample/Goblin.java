package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Goblin extends Unit {
    public Goblin(double x,double y) {
        super(10, 200, 3,1, 250,new Rectangle(x,y,20,20)
                ,new Text(x,y,"Goblin"));
        getShape().setFill(Paint.valueOf("Brown"));
    }
}
