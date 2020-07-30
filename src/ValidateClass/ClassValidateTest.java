package ValidateClass;

public class ClassValidateTest {
    public static ClassValidateExample classValidateTest;
    public static String[] validClass = {"C0318G","A0318H","P0318G","C0318I","A0318K","P0318L","C0318M"};
    public static String[] invalidClass = {"M0318A","A0318B","B0318L","C0318A","A0318Z","P!318L","C@318M"};

    public static void main(String[] args) {
        classValidateTest = new ClassValidateExample();

        for (String s: validClass){
            boolean isValidate = classValidateTest.validate(s);
            System.out.println("Class " + s + " is " + isValidate );
        }

        System.out.println("----------------");
        for (String s: invalidClass){
            boolean isValidate = classValidateTest.validate(s);
            System.out.println("Class " + s + " is " + isValidate );
        }

    }
}
