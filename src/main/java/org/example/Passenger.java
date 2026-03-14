package org.example;

public class Passenger {
    private String name;
    private String status;
    private  double price;

    public Passenger(String cur_name, String cur_status){
        this.name=cur_name;
        this.status = cur_status;
    }
    public Passenger(String cur_name, String cur_status, double cur_price){
        this.name=cur_name;
        this.status = cur_status;
        this.price = cur_price;
    }

    public String getName(){
        return name;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double cur_price){
        this.price = cur_price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " " + status + " " + price;
    }
}
