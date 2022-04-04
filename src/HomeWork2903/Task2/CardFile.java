package HomeWork2903.Task2;

import java.util.ArrayList;
import java.util.List;

/*) доп2. Опишите класс Картотека. Он должен содержать метод, который будет принимать 3 параметра: массив книг, имя и фамилию.
        Возвращать этот метод должен массив книг этого автора (либо пустой массив, если книг этого автора нет).
        */
public class CardFile {

    public Authors findBook(String name, List library2) {
        for (Authors author : library2) {
            if (author.getName().equals(name))
                return author;
        }
    }
        return null;
}



