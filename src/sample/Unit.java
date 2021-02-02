package sample;

import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

public abstract class Unit {

    private int energy;

    private int life;

    private int speed;

    private int range;

    private int damage;

    private Shape shape;

    private Text text;

    public Unit(int energy, int life, int speed, int range, int damage, Shape shape,Text text) {
        this.energy = energy;
        this.life = life;
        this.speed = speed;
        this.range = range;
        this.damage = damage;
        this.shape = shape;
        this.text= text ;
    }

    public Shape[] getShapes(){
        return new Shape[]{getShape(), text};
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
