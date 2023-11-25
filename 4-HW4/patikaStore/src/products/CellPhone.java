package products;

import java.awt.font.TextHitInfo;

public class CellPhone extends Product{
   public CellPhone(String uniqueID, int unitPrice, double discountRate, int amountOfStock, String name, String brandName, int memory, double sizeOfScreen, int battery, int ram, String color, int camera){
       super(uniqueID, unitPrice, discountRate, amountOfStock, name, brandName, memory, sizeOfScreen, battery, ram, color, camera);
   }

    @Override
    public void showInfos(){
        System.out.println("| " + this.getUniqueID() + " | " + this.getName() + "   | " + this.getUnitPrice() + " | " + this.getBrandName() + " | " + this.getMemory() + " | " + this.getSizeOfScreen() + " | " + this.getCamera() + " | " + this.getBattery() + " | " + this.getRam() + " | " + this.getColor());
    }
}
