import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Equipment {
    private int ram;
    private int ssd;

    @Builder
    public Laptop(String brand, String model, int ram, int ssd) {
        super(brand, model);
        this.ram = ram;
        this.ssd = ssd;
    }
}
