package org.example;

public class Main {
    public static void main(String[] args) {

        Builder_taxi Taxi = new Builder_taxi();
        Director dir1 = new Director(Taxi);
        Vechicle new_Vechicle1 = dir1.manufactureTaxiWithFamily();
        System.out.println(new_Vechicle1.toString());


        Builder_bus bus = new Builder_bus();
        Director dir2 = new Director(bus);
        Vechicle new_Vechicle2 = dir2.manufactureBus3passengers();
        System.out.println(new_Vechicle2.toString());
    }
}