
public interface Signup {

    void getForm();

    void saveForm();

    void validateForm(String name, String phone, String address);

    void validateOnlyEmail();
}
