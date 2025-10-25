package homework_11;

public class Main {

    public static void main(String[] args) {

        ChefRobot chef = new ChefRobot("IU-4", 400, "USA", "венчик", false);
        SapperRobot sapper = new SapperRobot("FD-5", 500, "titan", "манипулятор", false);
        BuilderRobot builder = new BuilderRobot("DO-9", 900, "RU", "марипулятор", "metall", false);

        chef.fixRobot();
        sapper.fixRobot();
        builder.fixRobot();

        Robot[] exebition = {chef, sapper, builder};
        RobotEngineer[] engineerExebition = {sapper, builder};
        SapperRobot[] sapperExebition = {sapper};

        System.out.println("==========================================");
        for (Robot robot:exebition) {
            robot.uniquePossibility();
        }

        System.out.println("==========================================");
        for (RobotEngineer robot:engineerExebition) {
            robot.createItem();
        }

        System.out.println("==========================================");
        for (SapperRobot robot:sapperExebition) {
            robot.uniquePossibility();
        }
        System.out.println("==========================================");

        chef.turnOffRobot();
        chef.turnOnRobot();
        chef.turnOnRobot();
        chef.turnOffRobot();

    }
}
//1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)
//1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
//1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
//1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.