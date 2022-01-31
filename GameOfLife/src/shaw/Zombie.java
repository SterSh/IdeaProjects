package shaw;

import java.awt.Color;
import java.util.Random;

public class Zombie extends Creature implements Movable, Aggressor {
    Random _rand;

    /**
     * Creates an animal with 1 health point.
     */
    public Zombie() {
        _health = 1;
        _rand = new Random();
    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(0, 0, 255);
    }

    Boolean isAlive() {
        return _health > 0;
    }

    public void attack(Creature target) {
        if((target != null) && (target instanceof Animal) || (target instanceof Wolf)) {
            target.takeDamage(10);
        }
    }

    public void move() {
        _location.x++;
    }
}
