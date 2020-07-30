package ValidatePhoneNumber;

public class PhoneNumberValidateTest {
    public static PhoneNumberValidate phoneNumberValidate;
    public static String[] validNumber = {"(84)-(0978489648)","(00)-(0123456798)"};
    public static String[] invalidNumber = {"(a1)-(0978489648)","(@@)-(0123456798)","(84)-(2978489648)","(84)-(00978489648)"};

    public static void main(String[] args) {
        phoneNumberValidate = new PhoneNumberValidate();

        for (String phoneNumber: validNumber){
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println(phoneNumber + " is " +isValid );
        }

        for (String phoneNumber: invalidNumber){
            boolean isValid = phoneNumberValidate.validate(phoneNumber);
            System.out.println(phoneNumber + " is " +isValid );
        }
    }
}

