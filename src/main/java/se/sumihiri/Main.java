package se.sumihiri;

import static se.sumihiri.Context.Data.*;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(CAR_BRAND, CAR_YEAR),
                new Motorcycle(MOTORCYCLE_BRAND, MOTORCYCLE_YEAR),
                new Truck(TRUCK_BRAND_1, TRUCK_YEAR_1, TRUCK_LOAD_CAPACITY_1)
        };
        // The loop demonstrates polymorphism by calling displayFeatures and start for each object.
        for (Vehicle vehicle : vehicles) {
            vehicle.displayFeatures();
            vehicle.start(); // Polymorphism in action
            System.out.println();
        }

        // Testing overridden method in Truck class
        Truck coldStartTruck = new Truck(TRUCK_BRAND_2, TRUCK_YEAR_2, TRUCK_LOAD_CAPACITY_2);
        coldStartTruck.start(true); // Calling the overridden method
    }
}

