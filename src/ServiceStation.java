public class ServiceStation {
    public void check(Service vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + ((Vehicle) vehicle).modelName);
            for (int i = 0; i < ((Vehicle) vehicle).wheelsCount; i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).checkTrailer();
            }
        }
    }
}