package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Builder_taxi implements Builder_vechicle{
    Taxi taxi;
    final int amount_seats = 4;
    public double cur_price;
    Scanner scanner = new Scanner(System.in);

    public Taxi get_Vechicle() {
        return taxi;
    }

    //    public Builder_vechicle BoardPassenger(Passenger cur_pas){
//        if (passengers.size()<amount_seats){
//            if (cur_pas.getStatus()=="Child"){
//                this.dop_info+="Необходимо детское кресло";
//            }
//            passengers.add(cur_pas);
//        }
//        else{
//            System.out.println("В этом такси все места заняты");
//        }
//        return this;
//    };
    public  void BoardPassengers(Passenger ... pass){
        if (amount_seats - taxi.passengers.size()>=pass.length){
            for (int i = 0; i < pass.length; i++) {
                    if (pass[i].getStatus() == "Child") {
                        taxi.dop_info = "Необходимо детское кресло";
                    }
                    taxi.passengers.add(pass[i]);
            }
        }
        else {
                System.out.println("В этом такси недостаточно мест для всех этих пассажиров");
                System.out.println("Свободных мест: " + (amount_seats-taxi.passengers.size()));
        }
    };
    public void BoardDriver(Driver new_driver){
        if (new_driver.getStatus() == "Taxi") {
            if (taxi.driver == null) {
                taxi.driver = new_driver;
            } else {
                System.out.println("В этом такси уже есть водитель, второго не будет!");
            }
        } else {
            System.out.println("Категория водителя: " + new_driver.getStatus() + " не соответствует транспортному средству: Taxi");
        }
    };
    public void Set_price(){
        try {
            System.out.println("Введите стоимость такси: ");
            cur_price = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Введено некорректное значение стоимости!");
        }
        if (cur_price==0) {
            System.out.println("Выставляю базовую стоимость:");
            taxi.price = 100000;
        }
        else{
        taxi.price = cur_price;
        }
    };
    public Taxi Build(){
        taxi = new Taxi();
        return taxi;
    }
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
