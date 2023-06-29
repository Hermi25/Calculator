package lesson7;

public class Dog extends Animal{

    String breed;

    public Dog(String name, int age, String sound, String breed) {
        super(name, age, sound);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("wof wof wof!");
    }
}
