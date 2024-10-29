
class Car {

    public int doors = 4;
    public int wheels = 4;
    public int kms = 0;
    public float temp;
    public String location;

    //<public/private> <static> <datatype> <function name> () {}
    void start() {
        System.out.println("Starting Car");
    }

    int runCar(int newKms, float engineTem, String currentLocation) {
        this.kms = this.kms + newKms;
        this.temp = engineTem;
        this.location = currentLocation;
        return this.kms;
    }

    void stop() {
        System.out.println("Stopping Car");
    }

    void print() {
        System.out.println("Car has Run " + this.kms + " Kms");
        System.out.println("Car Temp " + this.temp + " C");
        System.out.println("Car Location " + this.location);
    }

    static void test() {
        System.out.println("this can be called directly");
    }

    public Car(String name) {
        System.out.println(name);
    }

}
