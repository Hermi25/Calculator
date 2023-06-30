package lesson5.lesson7;

public class Animal {
    String name;
    int age;
    String sound;
    private String colorFur;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public Animal(String name, int age, String sound, String colorFur) {

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + sound);
    }

    public class Zoo {
        public static void main(String[] args) {
            Animal[] animals = new Animal[4];
            animals[0] = new Cat("Whiskers", 5, "Purr", "Friendly");
            animals[1] = new Dog("Fido", 3, "Bark", "Labrador");
            animals[2] = new Bird("Tweety", 1, "Tweet", "Yellow");
            animals[3] = new Alpaka("Lusia", 2, "Deeej", "Rainbow");

            for (Animal animal : animals) {
                animal.printInfo();
            }
        }

    }

}