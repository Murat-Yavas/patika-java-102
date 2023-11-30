package insurance;

public class TravelInsurance extends Insurance{

    public TravelInsurance(){
        super(10000);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.15);
    }
}
