public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель для " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп для " + modelName);
    }
}