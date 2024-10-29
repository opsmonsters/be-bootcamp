
class Laptop {

    public String laptopModel;

    public Laptop() {
        this.laptopModel = "Generic";
    }

    public Laptop(String name) {
        this.laptopModel = name;
    }

    public static void main(String[] args) {
        Laptop noNameLaptop = new Laptop();
        System.out.println(noNameLaptop.laptopModel);

        Laptop hpLaptop = new Laptop("Hp");
        System.out.println(hpLaptop.laptopModel);
    }

}
