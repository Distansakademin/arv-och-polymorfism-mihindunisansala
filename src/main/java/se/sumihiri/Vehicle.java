package se.sumihiri;

public class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println("The vehicle is starting.");
    }

    void displayFeatures() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}


