
class ElectricCar extends Car {

    int batteryLevel;

    public ElectricCar(String name) {
        super(name);
    }

    public static void main(String args[]) {
        ElectricCar electricCar = new ElectricCar("Tata");
        electricCar.start();
    }
}
