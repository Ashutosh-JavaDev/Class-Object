package Inheritate;

import java.util.*;

class vehicle {
    String Modelname, FuelType;
    int Year;

    void getInput(String Modelname, String FuelType, int Year) {
        this.Modelname = Modelname;
        this.FuelType = FuelType;
        this.Year = Year;
    }

    String setModelName() {
        return Modelname;
    }

    String setFuelType() {
        return FuelType;
    }

    int setYear() {
        return Year;
    }

    float calFuel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Much Distance Travel\nNote:insert only number");
        float distance = sc.nextFloat();
        System.out.println("Fuel Consumed while travelling?");
        float fuel = sc.nextFloat();
        float calculate = distance / fuel;
        return calculate;
    }

    double distancetravel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Minimum Speed of Your Travelling");
        float speed = sc.nextFloat();
        System.out.println("Insert Time Taken while Travelling\nformat 'HH.MM'");
        float time = sc.nextFloat();
        double calculateDistance = speed * time;
        return calculateDistance;
    }

    double maxSpeed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Time Taken while Travelling\nformat 'HH.MM'");
        float time = sc.nextFloat();
        double vmax = 2 * Math.PI / time;
        return vmax;
    }
}

class truck extends vehicle {
    void getTruckValue() {
        getInput(Modelname, FuelType, Year);
        System.out.println("Truck Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
    }
}

// Car
class car extends vehicle {
    void getCarValue() {
        getInput(Modelname, FuelType, Year);
        System.out.println("car Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
    }
}

// Bike
class bike extends vehicle {
    void getBikeValue() {
        getInput(Modelname, FuelType, Year);
        System.out.println("Bike Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        truck Truck = new truck();
        System.out.println("Pass Truck information");
        System.out.println("Model Name:");
        Truck.getInput(sc.nextLine(), null, 0);
        System.out.println("Fuel Type");
        Truck.getInput(null, sc.nextLine(), 0);
        System.out.println("Manufacture Year:");
        Truck.getInput(null, null, sc.nextInt());
        Truck.getTruckValue();
        // Car
        car Car = new car();
        System.out.println("Pass Car information");
        System.out.println("Model Name:");
        Car.getInput(sc.nextLine(), null, 0);
        System.out.println("Fuel Type");
        Car.getInput(null, sc.nextLine(), 0);
        System.out.println("Manufacture Year:");
        Car.getInput(null, null, sc.nextInt());
        Car.getCarValue();
        // Bike
        bike Bike = new bike();
        System.out.println("Pass Bike information");
        System.out.println("Model Name:");
        Bike.getInput(sc.nextLine(), null, 0);
        System.out.println("Fuel Type");
        Bike.getInput(null, sc.nextLine(), 0);
        System.out.println("Manufacture Year:");
        Bike.getInput(null, null, sc.nextInt());
        Bike.getBikeValue();
    }
}
