package homework_11;

public class SapperRobot implements Robot, RobotEngineer{

    private String model;
    private int power;
    private String material;
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
        System.out.println("Разминирую взрывчатку");
    }

    @Override
    public void fixRobot() {
        System.out.println("Подготовка и ремонт робота сапера");
    }

    public SapperRobot(String model, int power, String material, String instrument, boolean isOn) {
        this.model = model;
        this.power = power;
        this.material = material;
        this.instrument = instrument;
        this.isOn = isOn;
    }

    @Override
    public void createItem() {
        System.out.println("РоботСапёр создаёт приспособление для разминирования");
    }
}
//РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
//Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.
//В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)