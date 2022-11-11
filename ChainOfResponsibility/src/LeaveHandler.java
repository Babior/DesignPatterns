import lombok.Data;

@Data
public abstract class LeaveHandler {
    protected LeaveHandler superVisor;

    public abstract String applyLeave(Leave leave);
}
