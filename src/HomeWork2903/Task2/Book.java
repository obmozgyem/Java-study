package HomeWork2903.Task2;

//Описать класс Книга. Поля: название, количество страниц, автор, формат.
public class Book {
    private String title;
    private int pages;
    private Authors author;
    private String format;

    public Book(String title, int pages, Authors author, String format) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.format = format;
    }


    @Override
    public String toString() {
        return "Book: " +
                "title= " + title +
                ", pages= " + pages +
                ", format= "+ format + "; "  + author;
    }


}
