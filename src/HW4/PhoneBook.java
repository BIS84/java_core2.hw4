package HW4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        ArrayList<String> phoneList = phoneBook.get(name);
        if (phoneList == null) phoneList = new ArrayList<>();
        phoneList.add(phone);
        phoneBook.put(name, phoneList);
    }

    public ArrayList<String> getPhone(String name) {
        return phoneBook.get(name);
    }

    public void info() {
        System.out.println(phoneBook);
    }
}