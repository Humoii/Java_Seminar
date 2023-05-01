package Lesson6;

public class Cat {
    int id;
    String name;
    int age;
    String type;
    String ownerSurname;

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("%d %s %d %s %s",id ,name , age, type, ownerSurname);
    }

    public String meow() {
        return "meow";
    }
}
