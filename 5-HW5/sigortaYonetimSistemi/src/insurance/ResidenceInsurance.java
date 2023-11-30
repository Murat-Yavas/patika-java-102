package insurance;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(){
        super(45000);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.2);
    }
}
