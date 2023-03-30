public class MyClassSecond3 {
    public static void main(String[] args) {
        int number = 22;
        boolean result = isGreaterThanZero(number);
    }

    public static boolean isGreaterThanZero(int number) {
        boolean result = number > 0;
        if (result) {
            System.out.println("The number is greater than 0.");
        } else {
            System.out.println("The number isn't greater than 0.");
        }
        return result;
    }
}


