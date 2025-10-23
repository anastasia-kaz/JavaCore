package homework_9;

public class Animal {

    //1.Создать классы: Животное, Собака, Птица. Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения). Определить методы в классе животное: (издание звуков, животное играет)
    //1.9* Добавить поле в класс животное называемое номер (id). Присвоить уникальный номер каждому животному в зоопарке, увеличивая значение на единицу. Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.  Реализовать метод по удалению животного из зоопарка по номеру (id). Вывести информацию о все у животных в зоопарке.
    private int id;
    private String color;
    private int maxAge;
    private String typeOfFood;
    private String sound = "молчит";

    public Animal(String color, int maxAge, String typeOfFood) {
        this.color = color;
        this.maxAge = maxAge;
        this.typeOfFood = typeOfFood;
    }

    public Animal(int id, String color, int maxAge, String typeOfFood) {
        this.id = id;
        this.color = color;
        this.maxAge = maxAge;
        this.typeOfFood = typeOfFood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void makeSound (){
        System.out.println("Животное издает звук" + sound);
    }

    public void play (){
        System.out.println("Животное играет");
    }

    public String getSound() {
        return sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String toString() {
        return "Информация о животном: " + "\n" +
                "ID - " + id + "\n" +
                "цвет - " + color + "\n" +
                "максимальный возраст - " + maxAge + "\n" +
                "вид еды - " + typeOfFood + "\n";
    }
}
