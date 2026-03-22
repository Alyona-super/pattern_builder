package org.example;

public interface Builder_vechicle {
    public Vechicle get_Vechicle();
    public void set_Vechicle(Vechicle vechicle);
//    public Builder_vechicle BoardPassenger(Passenger cur_pas);
    public void BoardPassengers(Passenger ... pass);
    public void BoardDriver(Driver new_driver);
    public void Set_price();

}
