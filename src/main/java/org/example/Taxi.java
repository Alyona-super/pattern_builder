package org.example;

import java.util.ArrayList;
import java.util.List;

//Класс такси, для создания объекта типа: такси и добавления в него всех необходимых параметров
public class Taxi extends Vechicle{
    protected List<Passenger> passengers = new ArrayList<Passenger>();
    protected Driver driver = null;
    protected double price = 0;
    protected String dop_info = null;

    public Taxi(){
        System.out.println("Создано такси!");
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
    };
}
