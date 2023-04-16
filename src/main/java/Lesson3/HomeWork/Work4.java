package Lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work4 {
//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.
public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("C", "J", "D", "3", "2", "T"));
    List<String> list1 = new ArrayList<>();
    for (String el : list) {
        try {
        Integer.parseInt(el);
        }
        catch (NumberFormatException c){
        //  Заполнение нового листа нужными элементами
            list1.add(el);
        }
    }
    // Перезаписываем лист
    list = list1;
    System.out.println(list);
}
}
