package homework_11;

public interface Robot {

    void turnOnRobot();
    void turnOffRobot();
    void uniquePossibility();

    default void fixRobot(){
        System.out.println("Робот отремантирован");
    }
}
//1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).