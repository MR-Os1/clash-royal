package sample;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Arrays;

public class Map implements EventHandler<KeyEvent> {


    private Circle redCircleP1;

    private Circle redCircleP2;


    private Rectangle pathP1;

    private Rectangle pathP2;


    private Player player1;

    private Player player2;

    private Stage stage;

    private final double STEP = 10;

    public Map(Stage stage)  {
        redCircleP1 = new Circle(150,150,100);
        redCircleP1.setFill(Paint.valueOf("Red"));
        pathP1 = new Rectangle(250,100,1000,100);
        pathP1.setFill(Paint.valueOf("Yellow"));
        BlackTower masterP1 = new BlackTower(1300,50);

        player1 = new Player();

        BlueTower defencePoint1P1 = new BlueTower(800,50);
        BlueTower defencePoint2P1 = new BlueTower(1000,50);
        BlueTower defencePoint3P1 = new BlueTower(900,175);
        BlueTower defencePoint4P1 = new BlueTower(1100,175);

        player1.setDefenceTowers(Arrays.asList(masterP1,defencePoint1P1,defencePoint2P1,defencePoint3P1,defencePoint4P1));

        redCircleP2 = new Circle(1350,600,100);
        redCircleP2.setFill(Paint.valueOf("Red"));
        pathP2 = new Rectangle(250,550,1000,100);
        pathP2.setFill(Paint.valueOf("Yellow"));
        BlackTower masterP2 = new BlackTower(200,500);


        player2 = new Player();


        BlueTower defencePoint1P2 = new BlueTower(300,500);
        BlueTower defencePoint2P2 = new BlueTower(500,500);
        BlueTower defencePoint3P2 = new BlueTower(400,625);
        BlueTower defencePoint4P2 = new BlueTower(600,625);
        player2.setDefenceTowers(Arrays.asList(masterP2,defencePoint1P2,defencePoint2P2,defencePoint3P2,defencePoint4P2));


        AnimationTimer timer = new AnimationTimer() {
            private long lastUpdate = 0;
            // a timestamp in nanoseconds is passed to the handle(...) method
            // We want to throttle updates so they don't happen more than once every time
            @Override
            public void handle(long now) {
                if (now - lastUpdate >= 1000000000) {// nanoseconds per frame
                    lastUpdate = now;
                }
//                stage.setScene(new Scene(getScene(), 1500, 750));
            }
        };
        this.stage = stage;
        stage.setScene(new Scene(getScene(), 1500, 750));
        stage.getScene().setOnKeyPressed(this);
        timer.start();
    }

    @Override
    public void handle(KeyEvent event) {
        switch (event.getCode()){
            case Q:
                player1.addUnit(new Archer(150, 150));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case W:
                player1.addUnit(new Knight(150,150));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case E:
                player1.addUnit(new Goblin(150,150));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case R:
                player1.addUnit(new Shield(150,150));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case U:
                player2.addUnit(new Archer(1350, 600));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case I:
                player2.addUnit(new Knight(1350, 600));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case O:
                player2.addUnit(new Goblin(1350, 600));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
            case P:
                player2.addUnit(new Shield(1350, 600));
                stage.setScene(new Scene(getScene(), 1500, 750));
                break;
        }
        stage.getScene().setOnKeyPressed(this);

    }

    public Group getScene(){
        Group group = new Group(redCircleP1,
                pathP1,redCircleP2,
                pathP2);
        player1.getDefenceTowers().stream().map(Tower::getShape).forEach(shape -> group.getChildren().add(shape));
        player2.getDefenceTowers().stream().map(Tower::getShape).forEach(shape -> group.getChildren().add(shape));
        player1.getUnits().stream().map(Unit::getShapes).forEach(shapes -> {
            group.getChildren().add(shapes[0]);
            group.getChildren().add(shapes[1]);
        });
        player2.getUnits().stream().map(Unit::getShapes).forEach(shapes -> {
            group.getChildren().add(shapes[0]);
            group.getChildren().add(shapes[1]);
        });
        return group;
    }
}
