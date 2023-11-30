package insurance;

public class HealthInsurance extends Insurance{

    public HealthInsurance(){
        super(25000);
    }

    @Override
    public double calculate(){
        return (this.getPrice() * 0.3);
    }
}
