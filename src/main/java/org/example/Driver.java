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
    //    private static Driver single_driver;
//
//    private Driver(){
//        name_driver = "дефолтный Олег";
//    }
////    private Driver(String cur_name){
////        name_driver = cur_name;
////    }
//
//    public String getName_driver() {
//        if(name_driver==null) {
//            single_driver = new Driver();
//        }
//        return name_driver;
//    }
}