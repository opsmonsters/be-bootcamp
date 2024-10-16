
class SwitchStatement {

    public static void main(String[] args) {
        int diceRoll = 2;

        switch (diceRoll) {
            case 1:
                System.out.println("Dice Rolled to 1");
                break;
            case 2:
                System.out.println("Dice Rolled to 2");
                break;
            case 3:
                System.out.println("Dice Rolled to 3");
                break;
            case 4:
                System.out.println("Dice Rolled to 4");
                break;
            case 5:
                System.out.println("Dice Rolled to 5");
                break;
            case 6:
                System.out.println("Dice Rolled to 6");
                break;
            default:
                System.out.println("Invalid Dice roll");
                break;
        }
    }
}
