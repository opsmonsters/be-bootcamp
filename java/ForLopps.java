
class ForLoops {

    public static void main(String[] args) {
        // for(initilization; condition; increments){
        // code here
        // }

        // for (int i = 0; i < 100; i++) {
        // System.out.println(i);
        // }
        int[] oddNumbers = new int[50];
        int[] evenNumbers = new int[50];

        int totalOddNumbers = 0;
        int totalEvenNumbers = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[totalEvenNumbers] = i;
                totalEvenNumbers++;

            } else {
                oddNumbers[totalOddNumbers] = i;
                totalOddNumbers++;
            }

        }

        System.out.println("Odd Numbers");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }

        System.out.println("Even Numbers");
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }

    }
}
