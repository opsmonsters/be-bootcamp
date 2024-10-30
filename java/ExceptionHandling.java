
import java.util.Scanner;

class ExceptionHandling {

    public static void main(String[] args) {
        int age;

        System.out.println("Enter Your Age");
        Scanner scanner = new Scanner(System.in);
        try {
            age = scanner.nextInt();
            System.out.println(age);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            System.out.println("Closing Scanner");
            scanner.close();
        }
        System.out.println("Bye Bye");

    }
}
