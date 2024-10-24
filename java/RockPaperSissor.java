
import java.util.Random;
import java.util.Scanner;

class RockPaperSissor {

    public static void main(String[] args) {
        //Rock -> 1, Paper -> 2, Sissor -> 3
        int playerChoice;
        int computerChoice;

        while (true) {

            //set player input
            System.out.println("Enter Your Choice");
            System.out.println("1 -> Rock || 2 -> Paper || 3 -> Sissor");
            Scanner scanner = new Scanner(System.in);
            playerChoice = scanner.nextInt();

            // set computer input
            Random random = new Random();
            computerChoice = random.nextInt(1, 4);

            if (playerChoice == computerChoice) {
                System.out.println("Draw");
                break;
            }

            if (playerChoice == 1) {
                if (computerChoice == 3) {
                    System.out.println("Player Wins");
                } else {
                    System.out.println("Computer Wins");
                }
                break;
            }

            if (playerChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println("Player Wins");
                } else {
                    System.out.println("Computer Wins");
                }
                break;
            }

            if (playerChoice == 3) {
                if (computerChoice == 2) {
                    System.out.println("Player Wins");
                } else {
                    System.out.println("Computer Wins");
                }
                break;
            }

        }
    }
}
