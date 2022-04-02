package HomeWork2903.Task1;

/*Есть 3 класса – Прямоугольник, Квадрат, Круг (создать их).
Дополнить классы необходимыми полями и создать на их основе иерархию классов
(то есть кто-то от кого-то должен наследоваться, при необходимости можно создавать дополнительные классы и интерфейсы).
Создать класс CalculationUtils, в котором должны быть 2 метода,
принимающие любую фигуру и возвращающие ее а) площадь б) периметр.
 */

import java.util.ArrayList;
import java.util.List;

public class Taskfirst {

    public static void main(String[] args) {

        double area;
        double perimeter;


        List<CalculationUtils> calculationUtils = new ArrayList<>();
        calculationUtils.add(new Square(1));
        calculationUtils.add(new Rectangle(2, 4));
        calculationUtils.add(new Circle(10));


        for (CalculationUtils calculationUtils1 : calculationUtils) {
            area = calculationUtils1.areaCalculation();
            perimeter = calculationUtils1.perimeterCalculation();


            System.out.printf("%s, area = %.2f, perimeter = %.2f\n", calculationUtils, area, perimeter);
        }


// Square square1 = new Square(1.0);
//        Rectangle rectangle1 = new Rectangle(2, 1);
//        Circle circle1 = new Circle(1);
//
//        square1.areaCalculation();
//        square1.perimeterCalculation();
//        System.out.println();
//
//
//        rectangle1.areaCalculation();
//        rectangle1.perimeterCalculation();
//        System.out.println();
//
//
//        circle1.areaCalculation();
//        circle1.perimeterCalculation();


    }


}

