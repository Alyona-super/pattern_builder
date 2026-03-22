package org.example;

abstract class Driver {
    private String name_driver;
    public String status;

    Driver(){
        name_driver="Владимир";
    };

    Driver(String a){
        name_driver=a;
    };

    public String getStatus() {
        return status;
    }

    public String getName_driver() {
        return name_driver;
    }
}