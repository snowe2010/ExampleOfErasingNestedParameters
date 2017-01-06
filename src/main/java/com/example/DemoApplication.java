package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Tire oldTire = new Tire(20, "Rubber");
        Bolt bolt = new Bolt(10, "Steel");
        Wheel wheel = new Wheel(bolt, oldTire);
        Truck truck = new Truck(wheel);

        System.out.println("BEFORE: Truck: Bolt: Type: " + truck.getWheel().getBolt().getType() + " Size: " + truck.getWheel().getBolt().getSize());
        System.out.println("BEFORE: Truck: Tire: Type: " + truck.getWheel().getTire().getType() + " Size: " + truck.getWheel().getTire().getSize());

        CarMapper mapper = CarMapper.INSTANCE;

        Bolt newBolt = new Bolt(999, "Carbon Fiber");
        Wheel newWheel = new Wheel(newBolt, oldTire);
        Car car = new Car(newWheel);
        mapper.updateTruckWithCarDetails(car, truck);

        System.out.println("AFTER: Truck: Bolt: Type: " + truck.getWheel().getBolt().getType() + " Size: " + truck.getWheel().getBolt().getSize());
        System.out.println("AFTER: Truck: Tire: " + truck.getWheel().getTire());

    }
}
