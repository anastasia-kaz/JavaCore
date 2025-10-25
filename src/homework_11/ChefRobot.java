package homework_11;

public class ChefRobot implements Robot{

    private String model;
    private int power;
    private String conutry;
    private String instrument;
    private boolean isOn;

    @Override
    public void turnOnRobot() {
        if (!isOn) {
            System.out.println("Робот включен");
            isOn = true;
        } else {
            System.out.println("Робот уже включен");
        }
    }

    @Override
    public void turnOffRobot() {
        if (isOn) {
            System.out.println("Робот выключен");
            isOn = false;
        } else {
            System.out.println("Робот уже выключен");
        }
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Готовлю еду");
    }

    public ChefRobot(String model, int power, String conutry, String instrument, boolean isOn) {
        this.model = model;
        this.power = power;
        this.conutry = conutry;
        this.instrument = instrument;
        this.isOn = isOn;
    }
}
//РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).