package org.example;

public class Main {
    public static void main(String[] args) {
//        Builder_taxi Taxi = new Builder_taxi();
//        Director dir = new Director(Taxi);
//        Vechicle new_Vechicle = dir.manufactureBus3passengers();
//
//        if (new_Vechicle != null) {
//            System.out.println(new_Vechicle.toString());
//        } else {
//            System.out.println("Ошибка: транспортное средство не создано");
//        }

//
//        Builder_taxi Taxi = new Builder_taxi();
//        Director dir = new Director(Taxi);
//        Vechicle new_Vechicle = dir.manufactureTaxiWithFamily();
//        System.out.println(new_Vechicle.toString());


        Builder_bus bus = new Builder_bus();
        Director dir = new Director(bus);
        Vechicle new_Vechicle = dir.manufactureBus3passengers();
        System.out.println(new_Vechicle.toString());
    }
}