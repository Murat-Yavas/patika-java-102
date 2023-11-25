package brands;

public class Brand {
    private String brandName;

    public Brand(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public void showBrandName(){
        System.out.println(this.getBrandName());
    }
}
