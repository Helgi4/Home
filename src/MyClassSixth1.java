public class MyClassSixth1 {
    public static void main(String[] args) {
        int[] arr = {5, 11, 7, 20};
        printSmallestModuloDifference(arr);
    }

    public static void printSmallestModuloDifference(int[] arr) {
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                }
            }
        }
        System.out.println("The smallest difference value between numbers is: " + smallestDiff);
    }

}