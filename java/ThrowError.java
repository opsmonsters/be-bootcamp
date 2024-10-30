
import java.util.Scanner;

class ThrowError {

    public static void main(String[] args) throws Exception {
        int age;

        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age > 18) {
            System.out.println("I Can Vote");
        } else {
            throw new Exception("You Cannot Vote");
        }
        System.out.println("Bye..");
    }
}
