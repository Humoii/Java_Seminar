package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassFromLessonFive {
    public static void main(String[] args) {
//        Map<String, String> passportsToSernameMap = new HashMap<>();
//        passportsToSernameMap.put("134234", "Иванов");
//        passportsToSernameMap.put("345345", "Петров");
//        passportsToSernameMap.put("546456", "Васильев");
//
//        System.out.println(passportsToSernameMap);
//        int count = 0;
//        for (Map.Entry<String, String> entry : passportsToSernameMap.entrySet()) {
//            count++;
//            System.out.printf("%d) %s\t%s%n", count, entry.getKey(), entry.getValue());
//        }

/* for (String key : passportsToSernameMap.keySet()) {
System.out.printf("%s\t%s%n", key, passportsToSernameMap.get(key));
}*/

/* passportsToSernameMap.forEach((key, value) -> System.out.printf(
"%s\t%s%n",
key, value)
);*/
        String number = "MMCMXCIII";
        System.out.println(fromRomaToArabic(number));
    }

    public static int fromRomaToArabic(String num) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        int sumNum = 0;
        int next = -1;
        for (int i = 0; i < num.length() - 1; i++) {
            int current = numbers.get(num.charAt(i) + "");
            next = numbers.get(num.charAt(i + 1) + "");
            if (current < next) {
                sumNum -= current;
            } else {
                sumNum += current;
            }
        }
        sumNum += next;
        return sumNum;
    }
}

