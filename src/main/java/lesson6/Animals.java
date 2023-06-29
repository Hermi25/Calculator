package lesson6;

import java.util.Scanner;

public class Animals {
    private String name;
    private int age;
    private String color;

    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void sound(String animalSound) {

        System.out.println("This animal make a sound:  " + animalSound);

    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a name");
            String animalName = scanner.nextLine();

        System.out.println("How old am I?");
            int animalAge = scanner.nextInt();

        System.out.println("What is my fur color?");
            String animalColor = scanner.nextLine();

        scanner.nextLine(); // Consume the newline character

        System.out.println("What do I sound: ");
            String animalSound = scanner.nextLine();

        Animals animal = new Animals(animalName, animalAge, animalColor);
        animal.introduce();
        animal.sound(animalSound);

        scanner.close();
    }
}

