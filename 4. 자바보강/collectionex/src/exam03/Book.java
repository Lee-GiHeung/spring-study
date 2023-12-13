package exam03;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        // 현재대상 - 비교대상 : 오름차순
        // 비교대상 - 현재대상 : 내림차순
        // return title.hashCode() - o.title.hashCode(); // 오름차순
        // return o.title.hashCode() - title.hashCode(); // 내림차순
        // return title.compareTo(o.title); // 오름차순
        // return o.title.compareTo(title); // 내림차순
        return title.compareTo(o.title) * -1; // 내림차순

    }
}
