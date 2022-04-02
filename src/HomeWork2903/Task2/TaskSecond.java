package HomeWork2903.Task2;
/*Описать класс Книга. Поля: название, количество страниц, автор, формат. Автор – тоже класс, содержит имя, фамилию, возраст.
При создании экземпляров описанных классов нужно проверять, что введены валидные данные
(количество страниц и возраст должны быть больше 2, название книги и имя-фамилия автора – не пустые.
Если данные не проходят валидацию, то присваивать полям какие-то дефолтные значения).
Уделите внимание правильному описанию всех частей класса: приватные поля, методы доступа к полям (геттеры и сеттеры),
подумайте, какой доступ вы хотите предоставить, а какой – ограничить. Не забудьте про метод toString().

*) доп1. Поле автор замените на поле авторы. Это должен быть массив, хранящий список авторов.
*) доп2. Опишите класс Картотека. Он должен содержать метод, который будет принимать 3 параметра: массив книг, имя и фамилию.
Возвращать этот метод должен массив книг этого автора (либо пустой массив, если книг этого автора нет).
 */


import java.util.ArrayList;
import java.util.List;

public class TaskSecond {
    public static void main(String[] args) {
        Authors author1 = new Authors("Dmitry", "Peskov", 14);
        Book book1 = new Book("Mapa", 150, author1, "A4");


        List<Book> library = new ArrayList<>();
        library.add(new Book("Hello Java", 100, new Authors("Egor", "Pavlov", 30), "A5"));
        library.add(new Book("Dream", 10, new Authors("Igor", "Petrov", 10), "A3"));
        library.add(new Book("Life", 150, new Authors("Misha", "Ivanov", 20), "A4"));
        library.add(new Book("Time for fight", 500, new Authors("Egor", "Pavlov", 40), "A2"));


        for (Book lab : library) {
            System.out.println(lab);
        }




    }
}
