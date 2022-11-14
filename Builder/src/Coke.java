import java.math.BigDecimal;

public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(30);
    }
}
