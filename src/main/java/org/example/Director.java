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
        Driver driver = new TaxiDriver();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Adult");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
    public Vechicle manufactureBus3passengers() {
        Driver driver = new BusDriver();
        Passenger pas1 =new Passenger("Мама", "Adult");
        Passenger pas2 =new Passenger("Папа", "Discount");
        Passenger pas3 =new Passenger("Ребёнок", "Child");
        builder.BoardDriver(driver);
        builder.BoardPassengers(pas1, pas2, pas3);
        builder.Set_price();

        return builder.get_Vechicle();
    }
}
