import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean controller = true;
        Store patikaStore = new Store();

        System.out.println("PatikaStore Ürün Yönetim Paneli ");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("4 - Çıkış Yap");

        while (controller){
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int numberOfEvent = scan.nextInt();
            System.out.println("-----------------------------------------------");
            switch (numberOfEvent){
                case 1:
                    System.out.println("1 - Notebook İşlemleri");
                    System.out.println("| " + "ID" + " | " + "Ürün Adı" + "   | " + "Fiyat" + " | " + "Marka" + " | " + "Depolama" + " | " + "Ekran" + " | " + "Kamera" + " | " + "Batarya" + " | " + "RAM" + " | " + "Renk");
                    patikaStore.showAllNotebooks();
                    break;
                case 2:
                    System.out.println("2 - Cep Telefonu İşlemleri");
                    System.out.println("| " + "ID" + " | " + "Ürün Adı" + "   | " + "Fiyat" + " | " + "Marka" + " | " + "Depolama" + " | " + "Ekran" + " | " + "Kamera" + " | " + "Batarya" + " | " + "RAM" + " | " + "Renk");
                    patikaStore.showAllCellPhones();
                    break;
                case 3:
                    System.out.println("3 - Marka Listele");
                    patikaStore.showAllBrands();
                    break;
                case 4:
                    System.out.println("Çıkış Yapıldı");
                    controller = false;
                default:
                    System.out.println("Lütfen üstte belirtilen yönergeye göre bir sayı giriniz!");
            }
        }
    }
}
