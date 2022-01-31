package shaw;
import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {
    public static void main(String[] args) {
        VacationCalculator vc = new VacationCalculator();

        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 5);

        System.out.format(String.format("Total cost of trip to Japan: $%.2f%n", japanCost));
        System.out.format(String.format("Total cost of trip to Europe: $%.2f%n", europeCost));
        System.out.format(String.format("Total cost of trip to Mexico: $%.2f%n", mexicoCost));
    }

    public float calculateVacationCost(Destination dest, int TotalDays) {
        float cost;
        List<Expense> cruise = new ArrayList<Expense>();
        cruise.add(new Cruise(dest));
        cruise.add(new Dining(dest, 5));
        cruise.add(new Lodging(dest, 5));

        cost = tallyExpense(cruise);

        return cost;
    }

    private float tallyExpense(List<Expense> expenses) {
        float sum = 0;
         for (Expense e : expenses)
             sum += e.getCost();
         return sum;
    }
}
