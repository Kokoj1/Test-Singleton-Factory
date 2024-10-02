package com.company;


import java.util.ArrayList;
import java.util.List;

public class CarDealershipSingleton {
    List<Car> carList;

    static CarDealershipSingleton carDealershipSingleton;
    private CarDealershipSingleton(){

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void orderCar(Car car) {
    carList.add(car);
    }
    public String printOrders() {
        return carList.toString();
    }

    public static CarDealershipSingleton getInstance() {
        if (carDealershipSingleton == null) {
            synchronized (CarDealershipSingleton.class) {
                carDealershipSingleton = new CarDealershipSingleton();
                System.out.println("Singleton created");
                carDealershipSingleton.setCarList(new ArrayList());
            }
        }
        return carDealershipSingleton;
    }
}
