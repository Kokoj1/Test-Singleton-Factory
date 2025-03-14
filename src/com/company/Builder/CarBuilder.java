package com.company.Builder;

import com.company.Car;

public class CarBuilder {
    String engine;
    String color;
    String wheels;

    public CarBuilder addEngine(String engine){
        this.engine = engine;
        return this;
    }
    public CarBuilder addColor (String color){
        this.color = color;
        return this;
    }
    public CarBuilder addWheels (String wheels) {
        this.wheels = wheels;
        return this;
    }

    public Car build(){
        return new Car(engine, color, wheels);
    }
}
