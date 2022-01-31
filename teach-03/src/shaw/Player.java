package shaw;
import java.util.HashMap;
import java.util.Map;

public class Player {

    // Player Data Values //
    private String name;
    private int health;
    private int mana;
    private int gold;

    // Player Equipment Map Object //
    private Map<String, Integer> equipment;

    public Player(String name, int health, int mana, int gold) {
        // Initialize new Player //
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;

        // Stretch Challenge Add Equipment to HashMap //
        this.equipment = new HashMap<>();
    }

    // Make sure all items are added to Player Class correctly //
    public String toString() {
        return "name:" + name + ",health:" + health +",mana:" + mana + ",gold:" + gold + ",equipment:"
                + equipment.size();
    }

    // Stretch Challenge
    public void addEquipment(String item, int itemValue) {
        equipment.put(item, itemValue);
    }


}
