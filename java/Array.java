
class Array {

    public static void main(String[] args) {
        //<datatype>[] arrayName = new <Datatype>[size]
        int[] evenNumbers = new int[50]; //array created

        //inserting number into array
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;

        System.out.println(evenNumbers[2]);
        System.out.println(evenNumbers[3]);
        System.out.println(evenNumbers[49]);

        // The blow can be used if you are sending data from command line
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // Array Short Hand
        String[] monthsInYear = {"Jan", "Feb", "Mar", "April"};
        System.out.println(monthsInYear[3]);

        //length of an array
        System.out.println(monthsInYear.length);
    }
}
