
class StaticDemo {

    void nonStaticFunction() {
        System.out.println("Non Static Function");
    }

    static void staticFunction() {
        System.out.println("Static Function");
    }

    public static void main(String[] args) {
        staticFunction();
        new StaticDemo().nonStaticFunction();
    }
}
