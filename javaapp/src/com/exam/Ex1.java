package com.exam;

public class Ex1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("test");
        
        Engine engine = new AudiEngine();
        Car car = new Car();
        
       engine = new BenciEngine();
        car.setEngine(engine);
    }

}
