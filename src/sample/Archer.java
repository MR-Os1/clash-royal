package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Archer extends Unit{

    private Text text;


    public Archer(double x,double y) {
        super(15, 300, 1,2,200
                ,new Rectangle(x,y,20,20)
                ,new Text(x,y,"Archer"));
        getShape().setFill(Paint.valueOf("Green"));

    }



    public Text getText() {
        return text;
    }
}
