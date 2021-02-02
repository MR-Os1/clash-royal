package sample;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Shield extends Unit {

    public Shield(double x, double y) {
        super(10,1000, 1, 1,150
                ,new Rectangle(x,y,20,20)
                ,new Text(x,y,"Shield"));
    }
}
