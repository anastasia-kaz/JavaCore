package homework_18;

public class Car extends Thread {

    private String carName;
    private String number;
    private int stopTime;

    public Car(String carName, String number, int stopTime) {
        this.carName = carName;
        this.number = number;
        this.stopTime = stopTime;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getStopTime() {
        return stopTime;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }

    public void drive() {
        for (int i = 0; i <= 5; i++){
            System.out.println("машина " + carName + " c номером " + number + " едет");
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("машина заглохла пока спал поток");
            }
        }
    }

    @Override
    public void run() {
        drive();
    }
}
