import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static Warehouse warehouseInstance;
    private List<Equipment> equipmentList;

    private Warehouse(int size) {
        equipmentList = new ArrayList<>();
        warehouseInstance = this;
        init();
    }

    public static synchronized Warehouse getInstance() {
        if (warehouseInstance == null) {
            warehouseInstance = new Warehouse(3);
        }
        return warehouseInstance;
    }

    private void init() {
        Equipment e1 = new Laptop("hp", "f", 16, 512);
        Equipment e2 = new Laptop("lenovo", "a", 8, 256);
        Equipment e3 = new Monitor("dell", "b", 27, "IPS");
        Equipment e4 = new Monitor("philips", "c", 24, "IPS");
        equipmentList.add(e1);
        equipmentList.add(e2);
        equipmentList.add(e3);
        equipmentList.add(e4);
    }

    //Acquire an instance of the Reusable Object available in the Pool
    public Equipment acquireReusable() throws Exception {
        if (equipmentList.size() > 0) {
            Equipment r = equipmentList.get(equipmentList.size() - 1);
            equipmentList.remove(r);
            return r;
        } else {
            throw (new Exception("No free instance exception"));
        }

    }

    //The client releases an instance of the Reusable object and it is saved in the Pool to be able to be used by another client.
    public void disposeReusable(Equipment r) throws Exception {
        if (!equipmentList.contains(r)) {
            equipmentList.add(r);
        } else {
            throw (new Exception("Duplicated Instance Exception"));
        }
    }
}
