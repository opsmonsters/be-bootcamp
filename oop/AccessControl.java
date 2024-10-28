
class AccessControlHelper {

    public static int a = 10;
    private static int b = 20;

    public static void accessB() {
        System.out.println(b);
    }
}

class AccessControl {

    public static void main(String[] args) {
        System.out.println(AccessControlHelper.a);
        AccessControlHelper.accessB();
    }
}
