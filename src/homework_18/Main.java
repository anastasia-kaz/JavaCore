package homework_18;

public class Main {

    public static void main(String[] args) {
        startCarsWithJoin();
        startCarsWithRunnable();
    }


    private static void startCarsWithJoin() {
        Car car1 = new Car("тесла", "125478 BM-5", 1000);
        Car car2 = new Car("шевроле", "45789 IP-5", 2000);

        car1.start();
        try {
            car1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        car2.start();
    }


    private static void startCarsWithRunnable() {

        homework_18.runnable.Car car3 = new homework_18.runnable.Car("матиз", "987456 BM-5", 5000);
        homework_18.runnable.Car car4 = new homework_18.runnable.Car("жигули", "123456 BM-5", 3000);

        Thread car3Thread = new Thread(car3);
        Thread car4Thread = new Thread(car4);

        car3Thread.start();
        car4Thread.start();
    }
}