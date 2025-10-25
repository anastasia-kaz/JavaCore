package homework_11;

public class BuilderRobot implements Robot, RobotEngineer {

    private String model;
    private int power;
    private String conutry;
    private String instrument;
    private String material;
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
        System.out.println("Строю здания");
    }

    public BuilderRobot(String model, int power, String conutry, String instrument, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.conutry = conutry;
        this.instrument = instrument;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void createItem() {
        System.out.println("Робот строитель создаёт бетон");
    }
}
//РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)