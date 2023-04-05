package Lesson1.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class Work1 {
    //    Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void main(String[] args) {
        findingMaxAndMinArray(10);
    }

    public static void findingMaxAndMinArray(int size) {
        int arr[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5,101);
        }
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i]<=min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Max=%s, Min=%s",max,min);
    }
}
