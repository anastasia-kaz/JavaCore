package homework_9;

public class Bird extends Animal {
    //Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
    //При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт). Использовать наследование, где суперкласс-Животное. Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет) в классах Собака и Птица.
    private String family;
    private int maxFlightHeight;
    private String sound = "чик-чирик";

    public Bird(String color, int maxAge, String typeOfFood, String family, int maxFlightHeight) {
        super(color, maxAge, typeOfFood);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public Bird(int id, String color, int maxAge, String typeOfFood, String family, int maxFlightHeight) {
        super(id, color, maxAge, typeOfFood);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public String getSound() {
        return sound;
    }

    public void makeSound() {
        System.out.println("Птица " + family + " издает звук " + getSound());
    }

    ;

    public void peck() {
        System.out.println("Птица " + family + " клюеёт");
    }

    ;

    public void makeChicks() {
        System.out.println("Птица " + family + " высиживает птенцов");
    }

    ;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getMaxFlightHeight() {
        return maxFlightHeight;
    }

    public void setMaxFlightHeight(int maxFlightHeight) {
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String toString() {

        return super.toString() +
                "семейство - " + family + "\n" +
                "максимальная высота полета, м. - " + maxFlightHeight + "\n" +
                "издает звук - " + sound + "\n";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (this.getId() == bird.getId() && family.equals(bird.getFamily())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = getId() + family.hashCode() + maxFlightHeight * 10 + sound.hashCode() + getMaxAge() + getColor().hashCode() + getTypeOfFood().hashCode();
        return result;
    }
}
