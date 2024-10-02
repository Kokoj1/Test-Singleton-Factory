package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = Car.builder().addEngine("El").addColor("white").addWheels("race").build();
	Car car2 = Car.builder().addEngine("1.0").addColor("blue").addWheels("sport").build();
        System.out.println(car);

    CarDealershipSingleton carDealershipSingleton = CarDealershipSingleton.getInstance();

        carDealershipSingleton.orderCar(car);
        carDealershipSingleton.orderCar(car2);

        System.out.println(carDealershipSingleton.printOrders());

    }
}
