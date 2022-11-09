package com.github.moinmarcell.autohaus.repository;

import com.github.moinmarcell.autohaus.model.Car;

import java.util.List;

public class CarRepository {
    List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getCarByCarIdentityNumber(int carIdentityNumber){
        for(Car car : cars){
            if(car.getCarIdentityNumber() == carIdentityNumber){
                return car;
            }
        }
        return null;
    }

    public Car getCarByBrand(String brand){
        for(Car car : cars){
            if(car.getBrand().equalsIgnoreCase(brand)){
                return car;
            }
        }
        return null;
    }

    public Car getCarByModel(String model){
        for(Car car : cars){
            if(car.getModel().equalsIgnoreCase(model)){
                return car;
            }
        }
        return null;
    }

    public Car addCar(Car car){
        cars.add(car);
        return car;
    }

    public Car deleteCarByIdentityNumber(int carIdentityNumber){
        for(Car car : cars){
            if(car.getCarIdentityNumber() == carIdentityNumber){
                cars.remove(car);
                return car;
            }
        }
        return null;
    }
}
