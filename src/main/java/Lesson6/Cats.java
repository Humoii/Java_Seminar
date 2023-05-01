package Lesson6;

public class Cats {

    public static void main(String[] args) {
        Cat cat1 = new Cat(1);
        cat1.name = "Barsik";
        cat1.age = 5;
        cat1.type = "British";
        cat1.ownerSurname = "McGregor";

        Cat cat2 = new Cat(2);
        cat2.name = "Murka";
        cat2.age = 2;
        cat2.type = "Russian";
        cat2.ownerSurname = "Ivanov";

        Cat cat3 = new Cat(3);
        cat3.name = "Gerda";
        cat3.age = 14;
        cat3.type = "Siamese";
        cat3.ownerSurname = "Mironinko";
        System.out.println(cat3);
        System.out.println(cat2.meow());
    }
}
