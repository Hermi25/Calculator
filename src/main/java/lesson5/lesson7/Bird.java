package lesson5.lesson7;

public class Bird extends Animal{

    String featherColor;

    public Bird(String name, int age, String sound, String featherColor) {
        super(name, age, sound);
        this.featherColor = featherColor;
    }

    public void chirp() {
        System.out.println("Chirp chirp!");
    }
}
