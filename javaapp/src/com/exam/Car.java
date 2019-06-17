package com.exam;

public class Car {
    
    
    private Engine engine;

    public Car() {
        this.engine = new AudiEngine();
    }
    
    
    public Car(Engine engine) {
        this.engine = engine;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
}
