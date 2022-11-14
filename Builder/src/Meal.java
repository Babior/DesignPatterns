import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public BigDecimal getCost() {
        BigDecimal cost = new BigDecimal(0);

        for (Item item : items) {
            cost.add(item.price());
        }

        return cost;
    }

    public void showItems() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append("Item: ").append(item.name());
            sb.append(", Packing: ").append(item.packing().pack());
            sb.append(", Price: ").append(item.price());
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
