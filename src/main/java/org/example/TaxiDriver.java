package org.example;

//Реализация водителя такси
public class TaxiDriver extends Driver{
    private static TaxiDriver instanse;


    private TaxiDriver(){
        super();
    };

    public static TaxiDriver getInstanse() {
        if (instanse==null){
            instanse= new TaxiDriver();
            instanse.status = "Taxi";

        }
        return instanse;
    }
}