package org.example;


import java.util.Scanner;
//Класс-строитель для такси
public class Builder_taxi implements Builder_vechicle{
    Taxi taxi;
    final int amount_seats = 4;
    public double cur_price;
    Scanner scanner = new Scanner(System.in);

    public Taxi get_Vechicle() {
        return taxi;
    }

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

}
