package classes.dataManagement;

public class Validator {
    public static boolean validateCredentials(String email, String code){
        return email.indexOf("@") > 0 && email.indexOf(".") > 0 && code.length() == 4;
    }

    public static boolean validateIDNumber(String idNumber){
        String result = idNumber.trim();
        return result.length() == 13 && result.matches("-?\\d+(\\.\\d+)?");
    }
}
