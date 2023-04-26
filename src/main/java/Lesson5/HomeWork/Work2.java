package Lesson5.HomeWork;

import java.util.*;

public class Work2 {
    //    Пусть дан список сотрудников:
//    Иван Иванов
//    Светлана Петрова
//    Кристина Белова
//    Анна Мусина
//    Анна Крутова
//    Иван Юрин
//    Петр Лыков
//    Павел Чернов
//    Петр Чернышов
//    Мария Федорова
//    Марина Светлова
//    Мария Савина
//    Мария Рыкова
//    Марина Лугова
//    Анна Владимирова
//    Иван Мечников
//    Петр Петин
//    Иван Ежов
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        Map<String, String> list = new HashMap<>();
//        List<String> list = new ArrayList<>();
        list.put("Иванов", "Иван");
        list.put("Петрова", "Светлана");
        list.put("Белова", "Кристина");
        list.put("Мусина", "Анна");
        list.put("Юрин", "Иван");
        list.put("Лыков", "Петр");
        list.put("Чернышов", "Петр");
        list.put("Федорова", "Мария");
        list.put("Светлова", "Марина");
        list.put("Савина", "Мария");
        list.put("Рыкова", "Мария");
        list.put("Лугова", "Марина");
        list.put("Владимирова", "Анна");
        list.put("Мечников", "Иван");
        list.put("Петин", "Петр");
        list.put("Ежов", "Иван");
        Map<String, Integer> result = new HashMap<>();
        for (String key : list.keySet()) {
            int count = 0;
            for (String key1 : list.keySet()) {
                if (list.get(key).equals(list.get(key1))) {
                    count++;
                }
            }
            result.put(list.get(key), count);
        }
        int number = 0;
        for (String el : result.keySet()) {
            number++;
            System.out.printf("%d) %s=%s%n",number, el, result.get(el));
        }
    }
}
