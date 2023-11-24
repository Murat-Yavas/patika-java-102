public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String author;
    private int date;

    public Book(String name, int pageNumber, String author, int date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.date = date;
    }


    /*public int compareTo(Book o){
        return this.name.compareTo(o.name);
    }*/
    @Override
    public int compareTo(Book o) {
        return this.pageNumber - o.pageNumber;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
