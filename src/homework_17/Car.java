package homework_17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String brand;
    private int MaxSpeed;
    private String country;

    public Car(String brand, int maxSpeed, String country) {
        this.brand = brand;
        MaxSpeed = maxSpeed;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", MaxSpeed=" + MaxSpeed +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return MaxSpeed == car.MaxSpeed && Objects.equals(brand, car.brand) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, MaxSpeed, country);
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
