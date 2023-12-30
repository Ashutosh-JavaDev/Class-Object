package Inheritate;

import java.util.*;

class vehicle {
    String Modelname, FuelType;
    int Year;

    void getModelName(String Modelname) {
        this.Modelname = Modelname;
    }

    void getFuelType(String FuelType) {
        this.FuelType = FuelType;
    }

    void getYear(int Year) {
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
        System.out.println("Fuel Consumed while travelling?\nValue in liter");
        float fuel = sc.nextFloat();
        float calculate = distance / fuel;
        return calculate;
    }

    double distancetravel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Minimum Speed of Your Travelling");
        float speed = sc.nextFloat();
        System.out.println("Insert Time Taken while Travelling\nFormat 'HH.MM'");
        double time = sc.nextDouble();
        double calculateDistance = speed * time;
        return calculateDistance;
    }

    double maxSpeed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Time Taken while Travelling\nformat 'HH.MM'");
        double time = sc.nextDouble();
        double vmax = 2 * Math.PI / time;
        return vmax;
    }
}

class truck extends vehicle {
    void getTruckValue() {
        getModelName(Modelname);
        getFuelType(FuelType);
        getYear(Year);
        System.out.println("Truck Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        System.out.println("--------------------------------------------------------------");
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
        System.out.println("--------------------------------------------------------------");

    }
}

// Car
class car extends vehicle {
    void getCarValue() {
        getModelName(Modelname);
        getFuelType(FuelType);
        getYear(Year);
        System.out.println("car Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        System.out.println("--------------------------------------------------------------");
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
        System.out.println("--------------------------------------------------------------");

    }
}

// Bike
class bike extends vehicle {
    void getBikeValue() {
        getModelName(Modelname);
        getFuelType(FuelType);
        getYear(Year);
        System.out.println("Bike Name: " + setModelName());
        System.out.println("Fuel Type:  " + setFuelType());
        System.out.println("Manufacture:    " + setYear());
        System.out.println("--------------------------------------------------------------");
        float milage = calFuel();
        System.out.println("Milage: " + milage);
        double travelDistance = distancetravel();
        System.out.println("Distance:   " + travelDistance);
        double speedMax = maxSpeed();
        System.out.println("Speed per/Kilometer:    " + speedMax);
        System.out.println("--------------------------------------------------------------");

    }
}

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        truck Truck = new truck();
        System.out.println("Pass Truck information");
        System.out.println("Model Name:");
        Truck.getModelName(sc.nextLine());
        System.out.println("Fuel Type");
        Truck.getFuelType(sc.nextLine());
        System.out.println("Manufacture Year:");
        Truck.getYear(sc.nextInt());
        sc.nextLine();
        System.out.println("--------------------------------------------------------------");
        Truck.getTruckValue();
        // Car
        car Car = new car();
        System.out.println("Pass Car information");
        System.out.println("Model Name:");
        Car.getModelName(sc.nextLine());

        System.out.println("Fuel Type");
        Car.getFuelType(sc.nextLine());

        System.out.println("Manufacture Year:");
        Car.getYear(sc.nextInt());

        sc.nextLine();
        System.out.println("--------------------------------------------------------------");
        Car.getCarValue();
        // Bike
        bike Bike = new bike();
        System.out.println("Pass Bike information");
        System.out.println("Model Name:");
        Bike.getModelName(sc.nextLine());
        System.out.println("Fuel Type");
        Bike.getFuelType(sc.nextLine());
        System.out.println("Manufacture Year:");
        Bike.getYear(sc.nextInt());

        sc.nextLine();
        System.out.println("--------------------------------------------------------------");
        Bike.getBikeValue();
    }
}
