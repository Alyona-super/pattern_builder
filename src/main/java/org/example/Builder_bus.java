package org.example;

import java.util.List;

import static java.lang.Math.round;

//Класс-строитель для автобусов
public class Builder_bus implements Builder_vechicle{
    Bus bus;
    final double base_price = 74;
    final int amount_seats = 30;

    public Builder_bus(){
        this.bus = new Bus();
    }
    public Bus get_Vechicle() {
        return bus;
    }


    public void BoardPassengers(Passenger ... pass){
        if (amount_seats - bus.getPassengers().size()>=pass.length){
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
                List<Passenger> currentPassengers = bus.getPassengers();
                currentPassengers.add(pass[i]);
                bus.setPassengers(currentPassengers);
            }
        }
        else {
            System.out.println("В этом автобусе недостаточно мест для всех этих пассажиров");
            System.out.println("Свободных мест: " + (amount_seats-bus.getPassengers().size()));
        }
    };
    public void BoardDriver(Driver new_driver){
        if (new_driver.getStatus() == "Bus") {
            if (bus.getDriver() == null) {
                bus.setDriver(new_driver);
            } else {
                System.out.println("В этом автобусе уже есть водитель, второго не будет!");
            }
        } else {
            System.out.println("Категория водителя: " + new_driver.getStatus() + " не соответствует транспортному средству: Bus");
        }
    };

    public void Set_price(){
        if (bus.getPassengers().size()>0) {
            for (int i = 0; i < bus.getPassengers().size(); i++) {
                bus.price += (bus.getPassengers().get(i).getPrice());
            }
        }
        System.out.println("В автобусе пока нет пассажиров");
    };

}
