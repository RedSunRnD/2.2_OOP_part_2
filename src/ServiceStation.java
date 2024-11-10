public class ServiceStation {

    public void check(Serviceable serviceable) {
        if (serviceable != null) {
            serviceable.performService();
        }
    }

    public void check(Serviceable[] serviceables) {
        for (Serviceable serviceable : serviceables) {
            check(serviceable);
        }
    }
}