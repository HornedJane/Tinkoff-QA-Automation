package PhoneNumberValidation;

public class MainPhoneNumberValidation {

    public static String[] phoneValidation(String phone) {

        String message = "";
        String[] result = new String[2];

        if (phone.contains(" ")) {
            phone = phone.replace(" ", "");
            message += "Spaces were removed; ";
        }
        if (phone.startsWith("+7")) {
            phone = phone.replace("+7", "8");
            message += "'+7' was changed to '8'; ";
        }
        if (phone.contains("(") || phone.contains(")")) {
            phone = phone.replace("(", "");
            phone = phone.replace(")", "");
            message += "Brackets were removed; ";
        }
        if (message.isEmpty()) {
            message = "No changes occurred. ";
        }
        if (!phone.matches("\\d+")) {
            result[0] = "Phone number is incorrect";
            result[1] = message + "Number contains unexpected nonnumerical symbols.";
            return result;
        }
        if (phone.length() != 11) {
            result[0] = "Phone number is incorrect";
            result[1] = message + "Number length is incorrect.";
            return result;
        }
        else {
            result[0] = phone;
            result[1] = message;
            return result;
        }
    }

    public static void main(String[] args) {

        String input = "+ 7 (902) 235 23 13  "; //input string hardcoded here!
        String[] result = phoneValidation(input);

        for (int i = 0; i < 2; i++) {
            System.out.println(result[i]);
        }
    }
}
