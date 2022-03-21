package Archive.second;

/*
        Создать переменную r целого типа. Присвоить ей какое-то значение. r – радиус окружности.
        Вывести на экран площадь круга и длину окружности.
        Усложним, перед тем, как вычислять радиус и площадь, проверьте, что r – положительно.
        Если так – то вычисляем, если нет – выведем на консоль сообщение о невалидности входных данных.
         */

public class Example1 {
    public static void main(String[] args) {
        double r = 10;
//        if (r > 0) {
//            final double Pi = 3.1415926536;
//            double area = Pi * (r * r);
//            System.out.printf("Площадь круга = " + "%.0f", area);
//            System.out.println();
//            System.out.println("Площадь круга = " + area);
//            double length = Pi * (2 * r);
//            System.out.printf("Длина круга = " + "%.0f", length);
//            System.out.println();
//            System.out.println("Длина круга = " + length);
//        } else {
//            System.out.println("invalid input data");
//        }
//


//
//        { public static int abs2(r);
//            final double Pi = 3.1415926536;
//            double length = Pi*(2*r);
//            System.out.println("Площадь круга = " + length);
//        }
       // abs(r);
        System.out.println("Площадь круга = " + abs(r));
    }

    public static double abs(double r) {

        double area = Math.PI * (r * r);
//        System.out.println("Площадь круга = " + area);
        return area;
        // или можно         return Math.PI * (r * r);
    }
}
