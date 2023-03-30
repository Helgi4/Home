public class MyClassSecond2 {
    public static void main(String[] args) {
        String word1 = "Oleh";
        String word2 = "Moroz";
        sumOfLengths(word1, word2);
    }

    public static void sumOfLengths(String word1, String word2) {
        int sum = word1.length() + word2.length();
        System.out.println("The sum of the lengths of " + word1 + " and " + word2 + " is " + sum);
    }
}



