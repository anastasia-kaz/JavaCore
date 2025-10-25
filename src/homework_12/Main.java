package homework_12;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("порш каен", 500);
        Motorcycle motorcycle = new Motorcycle("ямах", 50);

        Garage<Vehicle> garage1 = new Garage<>();
        System.out.println("Гараж с машиной:");
        System.out.println("Транспорт: " + car.getName());
        System.out.println("Выбросы: " + car.getWasteProducts());
        garage1.isEntryPermitted(car);

        System.out.println();

        Garage<Vehicle> garage2 = new Garage<>();
        System.out.println("Гараж с мотоциклом:");
        System.out.println("Транспорт: " + motorcycle.getName());
        System.out.println("Выбросы: " + motorcycle.getWasteProducts());
        garage2.isEntryPermitted(motorcycle);

    }
}
