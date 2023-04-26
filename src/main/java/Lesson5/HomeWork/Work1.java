package Lesson5.HomeWork;

import java.util.*;

public class Work1 {
    //    Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//    что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        phoneBook();
    }

    public static void phoneBook() {
        while (true) {
            Map<String, String> phonName = new HashMap<>();
            Scanner countRecordingScan = new Scanner(System.in);
            System.out.println("Введите количество записей: ");
            Integer scanCountRecording = countRecordingScan.nextInt();

            for (int i = 0; i < scanCountRecording; i++) {
                Scanner countPhoneScan = new Scanner(System.in);
                System.out.println("Введите какое количество номеров телефона: ");
                Integer countPhone = countPhoneScan.nextInt();

                List<String> arr = new ArrayList<>();
                for (int j = 0; j < countPhone; j++) {
                    Scanner scanPhone = new Scanner(System.in);
                    System.out.println("Введите телефон: ");
                    String numbPhone = scanPhone.next();
                    arr.add(numbPhone);
                }

                Scanner scanName = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String name = scanName.next();
                phonName.put(arr.toString(), name);
            }
            int count = 0;
            for (String key : phonName.keySet()) {
                count++;
                System.out.printf("%d) %s\t%s%n", count, phonName.get(key), key);
            }
        }
    }
}
