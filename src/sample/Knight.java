package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Knight extends Unit{

    public Knight(double x , double y) {
        super(30,600,2,1,400
                ,new Rectangle(x,y,20,20)
                ,new Text(x,y,"Knight"));
        getShape().setFill(Paint.valueOf("Orange"));
    }
}
