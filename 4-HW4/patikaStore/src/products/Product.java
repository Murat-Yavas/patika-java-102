package products;

public abstract class Product {
    private String uniqueID;
    private int unitPrice;
    private double discountRate;
    private int amountOfStock;
    private String name;
    private String brandName;
    private int memory;
    private double sizeOfScreen;
    private int battery;
    private int ram;
    private String color;
    private int camera;

    public Product(String uniqueID, int unitPrice, double discountRate, int amountOfStock, String name, String brandName, int memory, double sizeOfScreen, int battery, int ram, String color, int camera) {
        this.uniqueID = uniqueID;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.name = name;
        this.brandName = brandName;
        this.memory = memory;
        this.sizeOfScreen = sizeOfScreen;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
        this.camera = camera;
    }

    public String getUniqueID() {
        return this.uniqueID;
    }
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountOfStock() {
        return this.amountOfStock;
    }
    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return this.brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getMemory() {
        return this.memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSizeOfScreen() {
        return this.sizeOfScreen;
    }
    public void setSizeOfScreen(double sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }

    public int getBattery() {
        return this.battery;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return this.ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public abstract void showInfos();
}
