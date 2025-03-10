package com.company;

import com.company.Builder.CarBuilder;

public class Car {
    String engine;
    String color;
    String wheels;

    public Car(String engine, String color, String wheels){
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
    }
    public static CarBuilder builder() {return new CarBuilder();}

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
