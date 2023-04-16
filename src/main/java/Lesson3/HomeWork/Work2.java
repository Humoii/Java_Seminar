package Lesson3.HomeWork;

import java.util.*;


public class Work2 {
    public static void main(String[] args) {
//        Задан целочисленный список ArrayList. Найти минимальное,
//        максимальное и среднее арифметическое из этого списка.
        findingArithmeticValuesInAList();
    }

    public static void findingArithmeticValuesInAList(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt( 10));
        }
        double average = list.stream().mapToInt(val -> val).average().orElse(0.0);

        System.out.println("Список: " + list);
        System.out.println("Максимальное значение в списке: " + Collections.max(list));
        System.out.println("Минимальное значение в списке: " + Collections.min(list));
        System.out.println("Среднее арифметическое значение списка: " + average);
    }
}
