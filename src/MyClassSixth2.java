import java.util.ArrayList;
import java.util.HashMap;

public class MyClassSixth2 {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Bible"); //+
        books.add("Will");
        books.add("The Great Gatsby");
        books.add("Nineteen Eighty-four"); //1984 - real cool book
        HashMap<Integer, String> bookMap = createBookHashMap(books);
        System.out.println(bookMap);
    }

    public static HashMap<Integer, String> createBookHashMap(ArrayList<String> books) {
        HashMap<Integer, String> bookMap = new HashMap<>();
        for (int i = 0; i < books.size(); i++) {
            bookMap.put(i, books.get(i));
        }
        return bookMap;
    }

}
