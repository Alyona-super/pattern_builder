package org.example;

//Реализация водителя автобуса
public class BusDriver extends Driver{
    private static BusDriver instanse;

    private BusDriver(){
        super();
    };

    public static BusDriver getInstanse() {
        if (instanse==null){
            instanse= new BusDriver();
            instanse.status = "Bus";

        }
        return instanse;
    }
}