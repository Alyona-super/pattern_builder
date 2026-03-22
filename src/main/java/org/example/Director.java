package org.example;

public class Director {
    private Builder_vechicle builder;

    public Director(Builder_vechicle new_builder){

        super();
        this.builder=new_builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Распорядитель не может начать создание транспорта без типа транспорта!");
        }
    }

    public Vechicle manufactureTaxiWithFamily() {
        Taxi cur_taxi = new Taxi();
        Driver driver = new TaxiDriver();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Adult");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        builder.set_Vechicle(cur_taxi);
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
    public Vechicle manufactureBus3passengers() {
        Bus cur_bus = new Bus();
        Driver driver = new BusDriver();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Discount");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        builder.set_Vechicle(cur_bus);
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
}
