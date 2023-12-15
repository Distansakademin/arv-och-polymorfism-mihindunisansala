package se.sumihiri;

public class Car extends Vehicle {


    Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    void start() {
        System.out.println("The car engine is starting.");
    }
}



