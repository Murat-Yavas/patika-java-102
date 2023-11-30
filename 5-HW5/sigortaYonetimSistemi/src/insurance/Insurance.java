package insurance;

import java.time.LocalDate;

public abstract class Insurance {
    private String nameOfInsurance;
    private double price;
    private LocalDate startingDate;
    private LocalDate endDay;

    public Insurance( double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculate();
}
