package org.example;

public class BusDriver extends Driver{
    private static BusDriver instanse;
//    private String status;
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