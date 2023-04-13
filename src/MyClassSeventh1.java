import java.util.Arrays;

public class MyClassSeventh1 {
    public static void divideArray(int[] array, int divisor) {
        if (divisor == 0) {
            System.out.println("Error: division by zero"); //You can't do it.
            return;
        }
        int length = array.length;
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                newArray[i] = array[i] / divisor;
            } catch (ArithmeticException e) {
                System.out.println("Error: division by zero");
                return;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] myArray = {100, 50, 0, 200, 300};
        int myDivisor = 5;
        divideArray(myArray, myDivisor);
    }
}

