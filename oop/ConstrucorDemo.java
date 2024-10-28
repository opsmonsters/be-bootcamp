
class CarConstructorDemo {

    int doors = 4;
    int wheels = 4;
    String make;
    String model;
    int engineCapacity;

    //constructor
    CarConstructorDemo(String userProvidedMake, String userProvidedModel, int userProvidedEnginerCapacity) {
        this.make = userProvidedMake;
        this.model = userProvidedModel;
        this.engineCapacity = userProvidedEnginerCapacity;
    }

}

class ConstructorDemo {

    public static void main(String[] args) {
        CarConstructorDemo myCar = new CarConstructorDemo("Toyota", "Innova", 2500);
        System.out.println(myCar.doors);
        System.out.println(myCar.wheels);
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.engineCapacity);

        CarConstructorDemo myCar2 = new CarConstructorDemo("Tata", "Nano", 1000);
        System.out.println(myCar2.doors);
        System.out.println(myCar2.wheels);
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.engineCapacity);
    }
}
