import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Uçurtma Avcısı",380,"Halit Hüseyin",1998);
        Book book2 = new Book("Kürk Mantolu Madonna",160,"SabahattinAli",1945);
        Book book3 = new Book("Gün Olur Asra Bedel",350,"Cengiz Aytmatov",1980);
        Book book4 = new Book("Ökkeş İşportacı",85,"Muzaffer İzgü",1985);
        Book book5 = new Book("İki Şehrin Hikayesi",60,"Charles Dickens",1970);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        //kitap ismi : yazar
        Map<String,String> infos = new HashMap<>();
        for (int i = 0; i < books.size(); i++){
            books.stream().forEach(book -> infos.put(book.getName(),book.getAuthorName()));
        }

        for (String i: infos.keySet()){
            System.out.println(i + " : " + infos.get(i));

        }

        System.out.println("----------------------");

        //sayfa sayısı 100'den çok olan kitaplar
        books.stream().filter(i -> i.getPageNumber()>100).forEach(b -> System.out.println(b.getName()));


    }
}
