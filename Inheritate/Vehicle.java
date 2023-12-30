package Inheritate;
import java.util.*;
class vehicle{
    String Modelname,FuelType;
    int Year;
    void getInput(String Modelname, String FuelType,int Year){
        this.Modelname=Modelname;
        this.FuelType=FuelType;
        this.Year=Year;
    }
    String setModelName(){
        return Modelname;
    }
    String setFuelType(){
        return FuelType;
    }
    int setYear(){
        return Year;
    }
    float calFuel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert How Much Distance Travel\nNote:insert only number");
        float distance=sc.nextFloat();
        System.out.println("Fuel Consumed while travelling?");
        float fuel=sc.nextFloat();
        float calculate=distance/fuel;
        return calculate;
    }
}
public class Vehicle {
    
}
