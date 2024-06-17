package classes.dataManagement;

public class DataFormatter {
    public static String formatGender(String s) {
        String result = "";

        if(s.toLowerCase().trim().equals("m") || s.toLowerCase().trim().equals("male"))
        {
            result = "male";
        }else if(s.toLowerCase().trim().equals("f") || s.toLowerCase().trim().equals("female")){
            result = "female";
        }else{
            return null;
        }

        return result;
    }

    public static String formatAccountNumber(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            if(i != 3){
                sb.append(generateFourDigitNumber() + "-");
            }else{
                sb.append(generateFourDigitNumber());
            }
        }

        return sb.toString();

    }

    private static int generateFourDigitNumber() {
        return (int)(1000 + Math.random() * 9000);
    }
}
