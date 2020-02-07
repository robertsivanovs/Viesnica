package Classes;
import java.util.regex.*;

public class Validator {
    public static boolean isName(String str){
        Pattern p = Pattern.compile("[a-zA-Z]+"); // Regex
        Matcher m = p.matcher(str);
        
        return m.matches() && str.length() >= 3;
    }
    public static boolean checkNumbers(String str){
        Pattern p = Pattern.compile("[0-9-]+"); // Regex
        Matcher m = p.matcher(str);
        
        return m.matches() && str.length() >= 4;
    }
}