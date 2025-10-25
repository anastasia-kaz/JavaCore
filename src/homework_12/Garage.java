package homework_12;

public class Garage <T extends Vehicle >{

    T Vehicle;

    public Boolean isEntryPermitted(T vehicle){
        if (vehicle.getWasteProducts() >= 100) {
            System.out.println("въезд запрещен");
            return false;
        } else {
            System.out.println("въезд разрешен");
            return true;
        }
    }
}
//1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.