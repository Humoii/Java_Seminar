package Lesson4.HomeWork;

import java.util.Collections;
import java.util.LinkedList;

public class Work2 {
    public static void main(String[] args) {
//        Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println(expandList(list));
    }

    public static LinkedList<String> expandList(LinkedList<String> list) {
        int count = 0;
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            count++;
            list1.add(list.get(list.size() - count));
        }
        return list1;
    }
}
