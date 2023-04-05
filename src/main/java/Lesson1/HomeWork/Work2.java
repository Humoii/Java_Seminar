package Lesson1.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class Work2 {
    //    Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
    public static void main(String[] args) {
        moveNumberEndArray(10);
    }

    public static void moveNumberEndArray(int size) {
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0,4);
        }
        System.out.println(Arrays.toString(nums));
        int val = 3;
        int n = 0;
        for (int j = 0; j < nums.length ; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    n = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = n;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}