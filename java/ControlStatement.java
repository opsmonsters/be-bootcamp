
class ControlStatement {

    public static void main(String[] args) {
        //consider a login form 

        //assume the below is given by user
        String username = "Vibin1";
        String password = "password1";

        //assume the below is from datbase
        String savedUsername = "Vibin";
        String savedPassword = "password";

        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("User Logged in");
            System.out.println("Valid Credentials");
        } else if (username.equals(savedUsername)) {
            System.out.println("User name is correct");
        } else if (password.equals(savedPassword)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Cannot Login User");
            System.out.println("invalid Credentials");
        }

        boolean a = true;
        boolean b = false;

        if (a || b) {
            System.out.println("one is true");
        } else {
            System.out.println("both is false");
        }

    }

}
