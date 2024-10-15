
public class Unary {

    public static void main(String[] args) {
        int a = 20;
        ++a; // this is same as a += 1
        a++;
        System.out.println(a);

        int b = 20;
        --b; // this is same as b -= 1
        b--;
        System.out.println(b);

        //unary operator prefix and postfix
        int c = 10;
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
