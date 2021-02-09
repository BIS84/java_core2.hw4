package HW4;

import java.util.*;

public class Main {

    public static void arrayPrint(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + ". ");
                System.out.println();
            }
        }
    }

    public static void main(String [] args) {

        String[] subscribers = {"Ivanov", "Petrov", "Sidorov", "Smirnov",
                "Mihailov", "Danilov", "Volkov", "Mihailov", "Petrov",
                "Nikolaev", "Nikolaev", "Kuznetsov", "Popov", "Kotov", "Orlov"};

        arrayPrint(subscribers);

        Set<String> subscribersSet = new LinkedHashSet<>();

        Collections.addAll(subscribersSet, subscribers);

        String[] uniqueSubscribers = new String[subscribersSet.size()];
        uniqueSubscribers = subscribersSet.toArray(uniqueSubscribers);

        arrayPrint(uniqueSubscribers);

        for (String uniqueSubscriber : uniqueSubscribers) {
            int k = 0;
            for (String subscriber : subscribers) {
                if (uniqueSubscriber.equals(subscriber)) {
                    k++;
                }
            }
            System.out.println(uniqueSubscriber + " - " + k);
        }

        String[] phoneNumber = {"1234567891", "1234567892", "1234567893",
                "1234567894", "1234567895", "1234567896", "1234567897",
                "1234567898", "1234567899", "1234567900", "1234567901",
                "1234567902", "1234567903", "1234567904", "1234567905"};


        //task 2
        PhoneBook phoneBook = new PhoneBook();

        for(int i = 0; i < subscribers.length; i++) {
            phoneBook.add(subscribers[i], phoneNumber[i]);
        }

        phoneBook.info();

        System.out.println(phoneBook.getPhone("Petrov"));
    }
}
