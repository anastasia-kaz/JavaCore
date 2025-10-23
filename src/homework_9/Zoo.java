package homework_9;

public class Zoo {

    private Animal[] animals = new Animal[0];

    public Animal[] getAnimalsArray() {
        return animals;
    }

    //1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая: public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное. Полученный массив нужно перезаписать в поле animals в классе Зоопарк.

    public void addAnimal(Animal animal) {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            count++;
        }

        Animal[] newAnimals = new Animal[count + 1];
        for (int i = 0; i < count; i++) {
            newAnimals[i] = animals[i];
        }
        newAnimals[count] = animal;
        animals = newAnimals;
    };
    //1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.

    public String getAnimals() {

        if (animals.length == 0) {
            return "В зоопарке нет животных";
        }
        StringBuilder result = new StringBuilder("Животные в зоопарке:\n");
        for (Animal animal : animals) {
            if (animal != null) {
                if (animal instanceof Dog) {
                    result.append("Собака по кличке ").append(((Dog) animal).getName()).append("\n");
                } else if (animal instanceof Bird) {
                    result.append("Птица семейства ").append(((Bird) animal).getFamily()).append("\n");
                } else if (animal instanceof Lion) {
                    result.append("Лев по имени ").append(((Lion) animal).getName()).append("\n");
                } else {
                    result.append("Неизвестное животное\n");
                }
            }
        }
        return result.toString();
    }


}
