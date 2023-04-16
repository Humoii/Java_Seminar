package Lesson3.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Work1 {

    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа.
        removingEvenNumbersFromAList();

    }
    public static void removingEvenNumbersFromAList() {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Список: " + numbers);
        numbers.removeIf(e -> (e % 2) == 0);;
        System.out.println("Не четные в списке: " + numbers);
    }

}


