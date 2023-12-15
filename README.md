# Arv_och_polymorfism Project
This Java project demonstrates object-oriented programming concepts, focusing on inheritance,
method overriding, and polymorphism through the implementation of a simple vehicle hierarchy.

## Classes
### Vehicle
The base class representing a generic vehicle.
- `brand` (String): The brand of the vehicle.
- `year` (int): The year of the vehicle.
  Methods:
- `displayFeatures()`: Displays the features of the vehicle.
- `start()`: Prints a message indicating the vehicle is starting.
### Car
A subclass of `Vehicle` representing a car.
- `start()` : Override Method - Returns car starting information.
### Motorcycle
Next subclass of `Vehicle` representing a motorcycle.
- `start()` : Override Method - Returns motorcycle starting information.
### Truck
A subclass of `Vehicle` representing a truck.
- `loadCapacity` (int): The load capacity of the truck in tons.
- `displayFeatures()`:  Override method for demonstration
- `start()` : Override Method - Returns truck starting information.
### Context->Data
All the data that run in the main class will be stored in a common data file.
- Purpose : Easy to access data. No need to change main class details. Only can change in the data file.
## Usage
1. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA).
2. Run the main class (`Main` or similar) to see examples of vehicle creation and method calls.
## Additional Details
- Source code available on (https://github.com/Distansakademin/arv-och-polymorfism-mihindunisansala).
