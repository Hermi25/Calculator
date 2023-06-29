package lesson7;

public class Cat extends Animal {

    String personality;

    public Cat(String name, int age, String sound, String personality) {
        super(name, age, sound);
        this.personality = personality;

    }

    public void meow() {
        System.out.println("Meow!");
    }
}
