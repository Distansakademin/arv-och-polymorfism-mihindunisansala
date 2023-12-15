package se.sumihiri;

public class Truck extends Vehicle {
    //This class "Truck" that extends the Vehicle class and includes the loadCapacity property.
    int loadCapacity;

    Truck(String brand, int year, int loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }
    //The displayFeatures method in the Truck class overrides the method in the base class to include truck-specific details.

    @Override
    void displayFeatures() {
        super.displayFeatures();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    // Overridden method for demonstration
    void start(boolean coldStart) {
        if (coldStart) {
            System.out.println("The truck is starting with a cold start.");
        } else {
            System.out.println("The truck is starting normally.");
        }
    }
}
