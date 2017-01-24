package com.example;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stuff.LoanTransactionId;
import com.example.stuff.Money;
import com.example.stuff.PostalAddress;
import com.example.stuff.PropertyId;
import com.example.stuff.PropertyIncome;
import com.example.stuff.PropertyRegisteredEvent;
import com.example.stuff.PropertyValueObject;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        mapTest1();
        mapTest2();
    }

    public static void mapTest1() {
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

    public static void mapTest2() {
        PROPERTY property = new PROPERTY();
        APPLICATION application = new APPLICATION();
        property.setStructureBuiltYear("1990");
        application.setPROPERTY(property);
        FannieMaeFile file = FannieMaeFile.builder().loanId(UUID.randomUUID()).loanTransactionId(UUID.randomUUID()).tenantId(UUID.randomUUID()).loanApplication(application).build();

        XsdMapper mapper = XsdMapper.INSTANCE;

        PropertyDetails propertyDetails = new PropertyDetails(2000, 1.0f, 1, "US");
        PropertyIncome propertyIncome = new PropertyIncome(new Money(200.00));
        PropertyValueObject propertyValueObject = new PropertyValueObject(new PropertyId(),
                                                                          new LoanTransactionId(),
                                                                          true,
                                                                          new PostalAddress("90000"),
                                                                          propertyDetails,
                                                                          propertyIncome
                                                                          );
        PropertyRegisteredEvent event = new PropertyRegisteredEvent("1", propertyValueObject);

        System.out.println("Before: Property event: year built: " + event.getProperty().getPropertyDetails().getYearBuilt());
        System.out.println("Before: File: year built: " + file.getLoanApplication().getPROPERTY().getStructureBuiltYear());

        mapper.updateFromProperty(event, file);

        System.out.println("After: Property event: year built: " + event.getProperty().getPropertyDetails().getYearBuilt());
        System.out.println("After: File: year built: " + file.getLoanApplication().getPROPERTY().getStructureBuiltYear());

    }
}
