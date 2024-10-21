
class BranchStaments {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                continue;
            }
            System.out.println(i);
        }

        int a = 10;
        while (true) {
            a++;
            System.out.println(a);
            if (a == 20) {
                break;
            }
        }

    }
}
