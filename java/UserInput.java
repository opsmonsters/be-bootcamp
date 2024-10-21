
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter Your Name \n");

        Scanner myScanner = new Scanner(System.in);

        String name = myScanner.nextLine();
        System.out.println("Your Name is " + name);

        System.out.println("Enter a number \n");
        int number = myScanner.nextInt();
        System.out.println("Your number is " + number);
    }
}
