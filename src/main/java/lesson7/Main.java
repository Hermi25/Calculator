package lesson7;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2022);
        Car car = new Car("Honda", "Civic", 2023, 4);

        System.out.println(vehicle.toString());
        System.out.println(car.toString());
    }
}

