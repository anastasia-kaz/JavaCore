package homework_9;

public class Dog extends Animal {

    //В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
    private String name;
    private String type;
    private int avgWeight;
    private String sound = "лай";


    public Dog(String color, int maxAge, String typeOfFood, String name, String type, int avgWeight) {
        super(color, maxAge, typeOfFood);
        this.name = name;
        this.type = type;
        this.avgWeight = avgWeight;
    }

    ;

    public Dog(int id, String color, int maxAge, String typeOfFood, String name, String type, int avgWeight) {
        super(id, color, maxAge, typeOfFood);
        this.name = name;
        this.type = type;
        this.avgWeight = avgWeight;
    }

    ;

    @Override
    public String getSound() {
        return sound;
    }

    public void makeSound() {
        System.out.println("Собака " + name + " издает звук " + getSound());
    }

    ;

    public void play() {
        System.out.println("Собака " + name + " играет");
    }

    ;

    public void bite() {
        System.out.println("Собака " + name + " кусает");
    }

    ;

    public void run() {
        System.out.println("Собака " + name + " бегает");
    }

    ;

    public void jump() {
        System.out.println("Собака " + name + " прыгает");
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAvgWeight() {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight) {
        this.avgWeight = avgWeight;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String toString() {

        return super.toString() +
                "имя - " + name + "\n" +
                "порода - " + type + "\n" +
                "средний вес, кг. - " + avgWeight + "\n" +
                "издает звук - " + sound + "\n";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (super.getId() == dog.getId() && name.equals(dog.getName()) && type.equals(dog.type)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = getId() + name.hashCode() + type.hashCode() + getAvgWeight() * 10 + sound.hashCode() + getMaxAge() * 5 + getColor().hashCode() + getTypeOfFood().hashCode();
        return result;
    }

}
