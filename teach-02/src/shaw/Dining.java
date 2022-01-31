package shaw;

public class Dining  implements Expense {

    Destination dest;
    int totalDays = 0;

    public Dining(Destination dest, int totalDays) {
        this.dest = dest;
        this.totalDays = totalDays;
    }

    public float getCost() {
        float totalCost = 0;
        switch (dest) {
            case Mexico:
                totalCost = 10 * totalDays;
                return totalCost;
            case Europe:
                totalCost = 20 * totalDays;
                return totalCost;
            case Japan:
                totalCost = 30 * totalDays;
                return totalCost;
            default:
                return totalCost;

        }
    }

}
