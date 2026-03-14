package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;


public class Builder_bus implements Builder_vechicle{
    Bus bus;
    final double base_price = 74;
    final int amount_seats = 30;

    public Bus get_Vechicle() {
        return bus;
    }

    public void BoardPassengers(Passenger ... pass){
        if (amount_seats - bus.passengers.size()>=pass.length){
            for (int i = 0; i < pass.length; i++) {
                switch (pass[i].getStatus()){
                    case "Child": pass[i].setPrice(round(base_price/2 *100)/100.00); break;
                    case "Adult": pass[i].setPrice(round(base_price *100)/100.00); break;
                    case "Discount": pass[i].setPrice(round(base_price/3 *100)/100.00); break;
                    default: {
                        System.out.println("Такой категории нет, пассажир поедет по стандартной стоимости");
                        pass[i].setPrice(base_price);
                        break;}
                }
                bus.passengers.add(pass[i]);
            }
        }
        else {
            System.out.println("В этом автобусе недостаточно мест для всех этих пассажиров");
            System.out.println("Свободных мест: " + (amount_seats-bus.passengers.size()));
        }
    };
    public void BoardDriver(Driver new_driver){
        if (new_driver.getStatus() == "Bus") {
            if (bus.driver == null) {
                bus.driver = new_driver;
            } else {
                System.out.println("В этом автобусе уже есть водитель, второго не будет!");
            }
        } else {
            System.out.println("Категория водителя: " + new_driver.getStatus() + " не соответствует транспортному средству: Bus");
        }
    };

    public void Set_price(){
        if (bus.passengers.size()>0) {
            for (int i = 0; i < bus.passengers.size(); i++) {
                bus.price += (bus.passengers.get(i).getPrice());
            }
        }
        System.out.println("В автобусе пока нет пассажиров");
    };
    public Bus Build() {
        bus = new Bus();
        return bus;
    };
//    public Vechicle Build(){
//        Vechicle new_Vechicle = new Vechicle(passengers, cur_driver, price, dop_info);
////        Проверка готовности
//        if ((new_Vechicle.getDriver()!=null) && (new_Vechicle.getPassengers().size()>0)){
//            System.out.println("Транспорт готов к отъезду!");
//            return  new_Vechicle;
//        }
//        else {
//            System.out.println("Транспорт не готов!");
//            return null;
//        }
//    };
}
