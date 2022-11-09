package com.github.moinmarcell.autohaus.model;

import java.util.Objects;
import java.util.Random;

public class Car {

    private final String brand;
    private final String model;
    private final int carIdentityNumber;

    public Car(String brand, String model) {
        Random random = new Random();
        this.brand = brand;
        this.model = model;
        carIdentityNumber = random.nextInt(1000, 1000000);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCarIdentityNumber() {
        return carIdentityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carIdentityNumber != car.carIdentityNumber) return false;
        if (!Objects.equals(brand, car.brand)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + carIdentityNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carIdentityNumber=" + carIdentityNumber +
                '}';
    }
}
