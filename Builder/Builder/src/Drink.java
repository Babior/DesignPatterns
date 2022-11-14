import java.math.BigDecimal;

public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
