package ValidateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidateExample {
    private static String CLASS_REGEX = "[CAP][0-9]{4}[GHIKLM]$";

    public ClassValidateExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
