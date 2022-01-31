package shaw;

import java.awt.*;


public class ZombiePlant extends Creature implements Aggressor, Spawner {
    boolean canSpawn = false;

    /**
     * Creates a zombie hunter with 1 health point. which can hunt zombies
     */
    public ZombiePlant() {
        _health = 1;
    }

    public void attack(Creature target) {
        if((target != null) && (target instanceof Zombie)) {
            target.takeDamage(1);
            canSpawn = true;
        }
    }

    public Shape getShape() {
        return Shape.Circle;
    }

    public Color getColor() {
        return new Color(255, 0, 0);
    }

    public Boolean isAlive() {
        return _health > 0;
    }

    public Creature spawnNewCreature() {
        if (canSpawn) {
            canSpawn = false;
            ZombiePlant spawn = new ZombiePlant();
            spawn.setLocation(new Point(_location.x, _location.y - 1));
            return spawn;
        }
        return null;
    }
}
