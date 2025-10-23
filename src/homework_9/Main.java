package homework_9;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("прозрачный", 1000, "не нуждается в питании");
        System.out.println(animal.toString());

        System.out.println();

        Dog dog = new Dog("коричневый", 20, "всеядный", "Рекс", "бигль", 8);
        Dog dog1 = new Dog("коричневый", 20, "всеядный", "Шмекс", "бигль", 8);
        Dog dog2 = new Dog("коричневый", 20, "всеядный", "Пекс", "бигль", 8);

        dog.bite();
        dog.run();
        dog.jump();
        dog.makeSound();
        dog.play();

        System.out.println(dog.toString());
        System.out.println("====================================================================");


        System.out.println();

        Bird bird = new Bird("цветной", 5, "корм", "попугай", 10);
        Bird bird2 = new Bird("коричневый", 5, "корм", "воробей", 10);
        Bird bird3 = new Bird("черно-белый", 5, "рыба", "пингвин", 0);



        bird.makeChicks();
        bird.peck();
        bird.makeSound();

        System.out.println(bird.toString());

        System.out.println("====================================================================");


        //1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы. (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.) 1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет). У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)

        Zoo zoo = new Zoo();
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        System.out.println(zoo.getAnimals());
        System.out.println("====================================================================");


        for (Animal a : zoo.getAnimalsArray()) {
            if (a != null) {
                if (a instanceof Dog) {
                    a.play();
                } else if (a instanceof Bird) {
                    a.makeSound();
                } else {
                    System.out.println("Неизвестное животное\n");
                }
            }
        }
        System.out.println("====================================================================");

        Lion lion1 = new Lion("рыжий", 50, "мясо", "Симба");
        Lion lion2 = new Lion("коричневый", 50, "мясо", "Шрам");
        Lion lion3 = new Lion("рыжий", 50, "мясо", "Муфаса");

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);


        System.out.println(zoo.getAnimals());

        System.out.println("====================================================================");

        for (Animal a : zoo.getAnimalsArray()) {
            if (a != null) {
                if (a instanceof Dog) {
                    a.play();
                } else if (a instanceof Bird) {
                    a.makeSound();
                } else if (a instanceof Lion) {
                    a.makeSound();
                } else {
                    System.out.println("Неизвестное животное\n");
                }
            }
        }

        System.out.println("====================================================================");

        int count = 1;
        for (Animal a : zoo.getAnimalsArray()) {
            a.setId(count++);
            System.out.println(a.toString());
        }

        System.out.println("====================================================================");

        Bird bird4 = new Bird(12, "черно-белый", 5, "рыба", "пингвин", 0);
        Bird bird5 = new Bird(13, "черно-белый", 5, "рыба", "пингвин", 0);
        System.out.println(bird5.equals(bird4));
        System.out.println(bird4.hashCode());
        System.out.println(bird5.hashCode());

        Dog dog4 = new Dog(10, "коричневый", 8, "всеядный", "Рекс", "бигль", 20);
        Dog dog5 = new Dog(11, "коричневый", 20, "всеядный", "Рекс", "бигль", 8);
        System.out.println(dog4.equals(dog5));
        System.out.println(dog4.hashCode());
        System.out.println(dog5.hashCode());

    }
}
