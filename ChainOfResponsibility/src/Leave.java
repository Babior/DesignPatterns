import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Leave {
    private int numberOfDays;
    private int empTier;
    private ReasonType reason;
}
