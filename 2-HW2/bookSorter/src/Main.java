import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>(Book::compareTo);

        books.add(new Book("Uçurtmayı Vurmasınlar",420,"Khalid Hosseini",2008));
        books.add(new Book("Kürk Mantolu Madonna",200,"Sabahhatin Ali",1950));
        books.add(new Book("İmparatorluğun En Uzun Yüzyılı",350,"Khalid Hosseini",2018));
        books.add(new Book("Saatleri Ayarlama Enstitüsü",380,"Ahmet Hamdi Tanpınar",1960));
        books.add(new Book("Fahreneit 451",280,"Ray Bradbury",1980));

        for(Book book : books){
            System.out.println(book.getName());
        }

        for(Book book : books){
            System.out.println(book.getPageNumber());
        }
    }
}
