public class Main {
    public static void main(String[] args) throws Exception {

        Warehouse pool;

        Equipment e1, e2, e3, e4;

        pool = Warehouse.getInstance();
        e1 = pool.acquireReusable();
        e2 = pool.acquireReusable();
        e3 = pool.acquireReusable();

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());


        pool.disposeReusable(e2);
        e4 = pool.acquireReusable();

        System.out.println(e4.toString());
        System.out.println(e1.toString());
    }
}