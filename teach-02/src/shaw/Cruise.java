package shaw;

public class Cruise implements Expense {
    Destination dest;
    float cost = 0;

    public Cruise(Destination dest) {
        this.dest = dest;
    }

    public float getCost() {
        switch (dest) {
            case Mexico:
                cost = 1000;
                return cost;
            case Europe:
                cost = 2000;
                return cost;
            case Japan:
                cost = 3000;
                return cost;
            default:
                return cost;

        }
    }
}