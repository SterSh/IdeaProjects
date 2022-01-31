package shaw;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aware, Aggressor, Spawner {

    Random _rand = new Random();
    int preferredDir;
    boolean canSpawn = false;

    public Wolf() {
        this.preferredDir = _rand.nextInt(4);
        _health = 1;
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {
        if (preferredDir == 0) {
            if (above instanceof Animal) {
                preferredDir = 0;
            } else if (right instanceof Animal) {
                preferredDir = 1;
            } else if (below instanceof Animal) {
                preferredDir = 2;
            } else if (left instanceof Animal) {
                preferredDir = 3;
            }
        }
        else if (preferredDir == 1) {
            if (right instanceof Animal) {
                preferredDir = 1;
            }
            else if (below instanceof Animal) {
                preferredDir = 2;
            }
            else if (left instanceof Animal) {
                preferredDir = 3;
            }
            else if (above instanceof Animal) {
                preferredDir = 0;
            }
        }
        else if (preferredDir == 2) {
            if (below instanceof Animal) {
                preferredDir = 2;
            } else if (left instanceof Animal) {
                preferredDir = 3;
            } else if (above instanceof Animal) {
                preferredDir = 0;
            } else if (right instanceof Animal) {
                preferredDir = 1;
            }
        }
        else if (preferredDir == 3) {
            if (left instanceof Animal) {
                preferredDir = 3;
            } else if (above instanceof Animal) {
                preferredDir = 0;
            } else if (right instanceof Animal) {
                preferredDir = 1;
            } else if (below instanceof Animal) {
                preferredDir = 2;
            }
        }

    }

    Shape getShape() {
        return Shape.Square;
    }

    Color getColor() {
        return new Color(128, 128, 128);
    }

    Boolean isAlive() {
        return _health > 0;
    }

    public void attack(Creature target) {
        // Wolves only eat Animals. Give the animal 1 damage
        // and increase our health by one.
        if(target instanceof Animal) {
            target.takeDamage(5);
            canSpawn = true;
        }
    }

    public Creature spawnNewCreature() {
        if (canSpawn) {
            canSpawn = false;
            Wolf spawn = new Wolf();
            spawn.setLocation(new Point(_location.x - 1, _location.y));
            return spawn;
        }
        return null;
    }

    public void move() {
        if (preferredDir == 0){
            _location.y--;
        }
        else if (preferredDir == 1) {
            _location.x++;
        }
        else if (preferredDir == 2) {
            _location.y++;
        }
        else if (preferredDir == 3) {
            _location.x--;
        }
    }

}
