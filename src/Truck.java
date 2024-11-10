public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void performService() {
        super.performService();
        checkTrailer();
    }
}