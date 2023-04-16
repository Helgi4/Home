public class MyClassSeventh2 {
    public static boolean isValidUkrainianPhoneNumber(String number) {
        if (!number.startsWith("+380")) { //But we can call 0959493455, without +38. Idk why
            return false;
        }
        String phoneNumber = number.substring(4);
        String code = phoneNumber.substring(0, 2);
        String phoneNumberWithoutCode = phoneNumber.substring(2);
        if (code.length() != 2 || !code.matches("\\d+")) {
            return false;
        }
        if (phoneNumberWithoutCode.length() != 7 || !phoneNumberWithoutCode.matches("\\d+")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String number = "+380959493455";
        boolean isValid = isValidUkrainianPhoneNumber(number);
        System.out.println("This phone number " + number + " is valid: " + isValid); //Only for Ukrainians format
    }
}


