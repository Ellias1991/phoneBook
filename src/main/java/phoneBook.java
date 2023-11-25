import java.util.ArrayList;
import java.util.HashMap;
public class phoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum) {


        ArrayList<Integer> phoneNums = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNums.add(phoneNum);
        phoneBook.put(name, phoneNums);
    }

    public ArrayList<Integer> find(String name) {

        return phoneBook.getOrDefault(name, new ArrayList<>());

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {

        return phoneBook;

    }
}

