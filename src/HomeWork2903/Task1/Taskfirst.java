package HomeWork2903.Task1;

/*Есть 3 класса – Прямоугольник, Квадрат, Круг (создать их).
Дополнить классы необходимыми полями и создать на их основе иерархию классов
(то есть кто-то от кого-то должен наследоваться, при необходимости можно создавать дополнительные классы и интерфейсы).
Создать класс CalculationUtils, в котором должны быть 2 метода,
принимающие любую фигуру и возвращающие ее а) площадь б) периметр.
 */

public class Taskfirst {

    public static void main(String[] args) {

        Square square1 = new Square(1.0);
        square1.areaCalculation();
        square1.perimeterCalculation();
        System.out.println();

        Rectangle rectangle1 = new Rectangle(2, 1);
        rectangle1.areaCalculation();
        rectangle1.perimeterCalculation();
        System.out.println();

        Circle circle1 = new Circle(1);
        circle1.areaCalculation();
        circle1.perimeterCalculation();


    }


}

