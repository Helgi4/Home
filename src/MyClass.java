public class MyClass {
    static int year = 2023;

    public static int myMethod(int a, int b) {
        int c = a + b; // sum of 2 numbers
        return c;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 55;
        int sum = myMethod(num1, num2);
        System.out.println(num1 + num2);
    }
}

