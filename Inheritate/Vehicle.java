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
        double vmax=2*Math.PI/time;
        return vmax;
    }
}
class truck extends vehicle{
    void getTruckValue(){
        getInput(Modelname, FuelType, Year);
        System.out.println("Truck Name: "+setModelName());
        System.out.println("Fuel Type:  "+setFuelType());
        System.out.println("Manufacture:    "+setYear());
        float milage=calFuel();
        System.out.println("Milage: "+milage);
        double travelDistance=distancetravel();
        System.out.println("Distance:   "+travelDistance);
        double speedMax=maxSpeed();
        System.out.println("Speed per/Kilometer:    "+speedMax);
    }
}
// Car
class car extends vehicle{
    void getCarValue(){
        getInput(Modelname, FuelType, Year);
        System.out.println("Truck Name: "+setModelName());
        System.out.println("Fuel Type:  "+setFuelType());
        System.out.println("Manufacture:    "+setYear());
        float milage=calFuel();
        System.out.println("Milage: "+milage);
        double travelDistance=distancetravel();
        System.out.println("Distance:   "+travelDistance);
        double speedMax=maxSpeed();
        System.out.println("Speed per/Kilometer:    "+speedMax);
    }
}
// Bike
class Bike extends vehicle{
    void getBikeValue(){
        getInput(Modelname, FuelType, Year);
        System.out.println("Truck Name: "+setModelName());
        System.out.println("Fuel Type:  "+setFuelType());
        System.out.println("Manufacture:    "+setYear());
        float milage=calFuel();
        System.out.println("Milage: "+milage);
        double travelDistance=distancetravel();
        System.out.println("Distance:   "+travelDistance);
        double speedMax=maxSpeed();
        System.out.println("Speed per/Kilometer:    "+speedMax);
    }
}
public class Vehicle {

}
