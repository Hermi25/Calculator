package lesson7;

public class Alpaka extends Animal{
    String colorFur;

    public Alpaka(String name, int age,String sound, String colorFur) {
        super(name, age, sound, colorFur);
        this.colorFur=colorFur;
    }
    public void mlem() {
        System.out.println("Dej sianko!");
    }
}
