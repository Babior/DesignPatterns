import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Monitor extends Equipment {
    private int diagonal;
    private String matrixType;

    @Builder
    public Monitor(String brand, String model, int diagonal, String matrixType) {
        super(brand, model);
        this.diagonal = diagonal;
        this.matrixType = matrixType;
    }
}
