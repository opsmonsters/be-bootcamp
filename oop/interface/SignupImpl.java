
class SignupImpl implements Signup {

    @Override
    public void getForm() {
        System.out.println("Getting your form");
    }

    @Override
    public void saveForm() {
        System.out.println("Saving your form with new data");
    }

    @Override
    public void validateForm(String name, String phone, String address) {
        System.out.println("Saving your form");
    }
}
