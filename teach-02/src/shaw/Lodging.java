package shaw;

public class Lodging implements Expense {
    Destination dest;
    int totalDays;

    public Lodging (Destination dest, int totalDays) {
        this.dest = dest;
        this.totalDays = totalDays;
    }
    public float getCost() {
        float lodgingCost = 0;
        float subTotal;
        float tax;

        switch(dest) {
            case Mexico:
                lodgingCost = 100 * totalDays;
                return lodgingCost;
            case Europe:
                subTotal = 200 * totalDays;
                tax = (subTotal * .1f);
                lodgingCost = tax + subTotal;
                return lodgingCost;
            case Japan:
                subTotal = 300 * totalDays;
                tax = (subTotal * .3f);
                lodgingCost = tax + subTotal;
                return lodgingCost;
            default:
                return lodgingCost;
        }
    }
}
