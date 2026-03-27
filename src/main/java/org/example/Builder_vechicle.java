package org.example;

public interface Builder_vechicle {
    Vechicle get_Vechicle();
//    Builder_vechicle BoardPassenger(Passenger cur_pas);
    void BoardPassengers(Passenger ... pass);
    void BoardDriver(Driver new_driver);
    void Set_price();

}
