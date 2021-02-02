package sample;

import javafx.scene.shape.Shape;

public abstract class Tower {


    private Shape shape;

    private Integer health;

    private Integer damage;

    private Integer range;

    public Tower(Shape shape,int health,int damage,int range) {
        this.shape = shape;
        this.damage = damage;
        this.range = range;
        this.health = health;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
