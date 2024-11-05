
class Recursion {

    public static void testRecursion(int input) {
        if (input == 0) {
            return;
        }
        System.out.println(input);
        input--;
        testRecursion(input);
    }

    public static void returntest(int input) {
        if (input == 0) {
            return;
        }
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        testRecursion(10);
        returntest(0);
    }
}
