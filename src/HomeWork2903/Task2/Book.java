package HomeWork2903.Task2;

import java.util.Objects;

//Описать класс Книга. Поля: название, количество страниц, автор, формат.
public class Book {
    private String title;
    private int pages;
    private Authors author;
    private String format;

    public Book() {

    }


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
                ", format= " + format + "; " + author;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(format, book.format);
//    }

 //   @Override
    //   public int hashCode() {
    //      return Objects.hash(title, pages, author, format);
    //   }

}

