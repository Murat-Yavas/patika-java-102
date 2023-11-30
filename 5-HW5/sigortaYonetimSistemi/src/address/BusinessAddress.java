package address;

public class BusinessAddress implements IAddress{
    private final String name;
    private final String address;
    private final int doorNumber;

    public BusinessAddress(String name, String address, int doorNumber) {
        this.name = name;
        this.address = address;
        this.doorNumber = doorNumber;
    }


}
