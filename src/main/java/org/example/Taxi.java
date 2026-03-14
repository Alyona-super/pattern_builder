package org.example;

import java.util.ArrayList;
import java.util.List;

public class Taxi extends Vechicle{
    protected List<Passenger> passengers = new ArrayList<Passenger>();
    protected Driver driver = null;
    protected double price = 0;
    protected String dop_info = null;

    public Taxi(){

    }
//    public Taxi(List<Passenger> pas, Driver dr, double pr, String dop){
//        this.passengers=pas;
//        this.driver=dr;
//        this.price=pr;
//        this.dop_info=dop;
//    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getPrice() {
        return price;
    }

    public String getDop_info() {
        return dop_info;
    }

    @Override
    public String toString(){
        if (this == null){
            System.out.println("Транспорт не готов!");
            return "null";
        }
        String info = "Информация о поездке: " + "\nВодитель: " + driver.getName_driver() + "\nПассажиры: " + passengers.toString() + "\nСтоимость поездки для всех пассажиров: " + price;

        if (dop_info!=null){
            info+="\n"+dop_info;
        }
        return info;
    }
}
