package org.example;

//Реализация водителя автобуса
public class BusDriver extends Driver{
    private static BusDriver instanse;

    public BusDriver(){
        super();
        super.status="Bus";
    };

}