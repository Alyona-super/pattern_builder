package org.example;

import java.util.ArrayList;
import java.util.List;

// Класс автобусов, для создания объекта типа: автобус и добавления в него всех необходимых параметров
public class Bus extends Vechicle{

    private List<Passenger> passengers = new ArrayList<Passenger>();
    private Driver driver = null;
    protected double price = 0;
    protected String dop_info = null;

    public Bus(){
        System.out.println("Создан автобус!");
    }


    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver dr){
        this.driver=dr;
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

    public void Check_ready(){
//        Проверка готовности
        if ((this.getDriver()!=null) && (this.getPassengers().size()>0)){
            System.out.println("Транспорт готов к отъезду!");
        }
        else {
            System.out.println("Транспорт не готов!");
        }
    }
}
