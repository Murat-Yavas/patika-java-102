import products.*;
import brands.*;

public class Store {
    //Cellphone
    CellPhone c1 = new CellPhone("1",12500,15,1000,"Samsung A70","Samsung",128,6.3,5300,6,"Black",32);
    CellPhone c2 = new CellPhone("2",45000,10,750,"iPhone","Apple 14",256,6.1,4800,8,"Red",64);
    Product[] productCells = {c1,c2};

    public void showAllCellPhones(){
        for(Product p: productCells) {
            p.showInfos();
        }
    }


    //Notebook
    Notebook n1 = new Notebook("1",25000,5,200,"ASUS Tuf Gaming","Asus", 2048,15.6,8000,16,"Blue",0);
    Notebook n2 = new Notebook("2",35000,5,200,"Monster Tulpar T7","Monster", 2048,15.6,8000,16,"Black",0);
    Product[] productNotebooks = {n1,n2};

    public void  showAllNotebooks(){
        for (Product p: productNotebooks){
            p.showInfos();
        }
    }

    //Marka
    Brand b1 = new Brand("Samsung");
    Brand b2 = new Brand("Apple");
    Brand b3 = new Brand("Huawei");
    Brand b4 = new Brand("Xiaomi");
    Brand b5 = new Brand("Lenovo");
    Brand b6 = new Brand("HP");
    Brand b7 = new Brand("Monster");
    Brand b8 = new Brand("Asus");

    Brand[] brands = {b1, b2, b3, b4, b5, b6, b7, b8};

    public void showAllBrands(){
        for (Brand brand : brands){
            brand.showBrandName();
        }
    }
}
