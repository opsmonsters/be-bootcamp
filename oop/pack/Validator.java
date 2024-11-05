
import tools.EmailValidator;
import tools.PhoneValidator;

class Validator {

    public static void main(String[] args) {
        System.out.println("Running Main class");
        PhoneValidator.checkPhone();
        EmailValidator.checkEmail();
    }
}
