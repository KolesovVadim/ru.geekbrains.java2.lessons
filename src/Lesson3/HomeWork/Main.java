package Lesson3.HomeWork;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final String[] names = {"Oksana", "Oksana", "Oksana", "Vladimir", "Vladimir", "Vladimir", "Aleksandr", "Aleksandr", "Aleksandr", "Dmitriy", "Dmitriy", "Dmitriy", "Vadim", "Anton", "Danil", "Egor"};

    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : names) {
            Integer count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, ++count);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.printf("Слово %s встречается %d раз %n", entry.getKey(), entry.getValue());

        }
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kolesov", "8-918-234");
        phoneBook.add("Bongarenko", "8-918-546");
        phoneBook.add("Gerasimov", "8-918-947");

        Set<String> surnames = phoneBook.allSurnames();
        for (String surname : surnames) {
            System.out.printf("Пользователь %s имеет номер(а) телефонов %s %n", surname, phoneBook.get(surname));
        }
    }
}
