package Lesson2.HomeWork;


import java.io.File;
import java.util.Objects;

public class Work3 {
    public static void main(String[] args) {

//        Напишите метод, который определит тип (расширение)
//        файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
        ex("src/main/java/Lesson2/HomeWork");
    }

    public static void ex(String path) {
        File dir = new File(path);
        int count = 1;
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            String ext = "";
            if (file.isDirectory()){
                ext = "dir";
            }else {
                String[] parts = file.getName().split("\\.");
                if (parts.length > 1){
                    ext = parts[parts.length - 1];
                }
            }
            System.out.printf("%10s) Расширение файла: %s%n", count++, ext);
        }
        
    }

}

