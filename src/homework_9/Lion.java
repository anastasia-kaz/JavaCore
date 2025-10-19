package homework_9;


public class Lion extends Animal{

    private String name;
    private String sound = "РРР";

    public Lion(String color, int maxAge, String typeOfFood, String name) {
        super(color, maxAge, typeOfFood);
        this.name = name;
    }

    @Override
    public String getSound() {
        return sound;
    }
    public void makeSound (){
        System.out.println("Лев по имени " + name + " издает звук " + getSound());
    };

    public void play (){
        System.out.println("Лев играет");
    }

    public String getName() {
        return name;
    }
}

//1.8 * Добавить класс Лев. Лев наследуется от животного. Переопределите в нем методы, которые есть в классе Животное (издание звуков, животное играет), с указанием, что это все делает лев (пример Лев играет). Создайте пару львов и выведите их поведение в консоль. Добавить трех львов в зоопарк. У вас должно быть девять животных в зоопарке. Ещё раз пройдитесь по всем животным и вызовите методы (издание звуков, животное играет).. У вас должны вывестись соответствующие реализации для 3 собак, для трёх птиц и 3 львов (Выполнять это в методе Main)