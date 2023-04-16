package Lesson3;

import java.util.*;

public class MainClassFromLessonThree {
    //Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
    public static void main(String[] args) {
        paradPlanet();
    }

    public static void paradPlanet() {

        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        System.out.println("Список: " + list);

        list.sort(Comparator.naturalOrder());
        System.out.println("Отсортированный список: " + list);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }

        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("Список без повторений: " + listWithoutDuplicates);
        sb.append(list.get(list.size() - 1)).append(": ").append(count).append(".");
        System.out.println("Количество повторяющихся наименований: " + sb);
    }
}
