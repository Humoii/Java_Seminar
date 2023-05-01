package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainClassFromLessonSix {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(Arrays.toString(fillArray(n)));
        System.out.println(uniqueValuesInArray(fillArray(n)));
    }

    private static Integer[] fillArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static double uniqueValuesInArray(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        set.addAll(Arrays.asList(array));
        return 1.0 * set.size() * 100 / array.length;
    }
}
