package insurance;

public class CarInsurance extends Insurance{

    public CarInsurance(){
        super(20000);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.25);
    }
}
