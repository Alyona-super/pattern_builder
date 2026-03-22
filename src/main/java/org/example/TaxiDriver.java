package org.example;

//Реализация водителя такси
public class TaxiDriver extends Driver{
    private static TaxiDriver instanse;


    public TaxiDriver(){
        super();
        super.status= "Taxi";
    };


}