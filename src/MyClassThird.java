public class MyClassThird {
    public static void main(String[] args) {
        String word1 = "Oleh";
        String word2 = "Andriana";
        String word3 = "Tereza";
        String longestWord = findLongestWord(word1, word2, word3);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String word1, String word2, String word3) {
        String longestWord = "";
        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            longestWord = word1;
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            longestWord = word2;
        } else {
            longestWord = word3;
        }
        return longestWord;
    }
}


