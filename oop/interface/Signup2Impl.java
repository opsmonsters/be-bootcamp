
class Signup2Impl implements Signup {

    @Override
    public void getForm() {
        System.out.println("Getting your form from signup2");
    }

    @Override
    public void saveForm() {
        System.out.println("Saving your form with new data");
    }

    @Override
    public void validateForm(String name, String phone, String address) {
        System.out.println("Saving your form");
    }

    @Override
    public void validateOnlyEmail() {
        System.out.println("validating email");

    }
}
