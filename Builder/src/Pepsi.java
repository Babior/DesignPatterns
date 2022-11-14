import java.math.BigDecimal;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(35);
    }
}
