public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("У велосипеда " + modelName + " нет двигателя для проверки.");
    }
}