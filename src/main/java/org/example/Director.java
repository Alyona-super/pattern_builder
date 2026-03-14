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
        Driver driver = TaxiDriver.getInstanse();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Adult");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        Taxi cur_taxi = (Taxi) builder.Build();
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
    public Vechicle manufactureBus3passengers() {
        Driver driver = BusDriver.getInstanse();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Discount");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        Bus cur_bus = (Bus) builder.Build();
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
}
