package Archive.HomeWork0203.second;

public class Examination {
    /*
     Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):
а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
б) вывести на консоль значение текущего положения,
доп 2.1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.
     */
    public static void main(String[] args) {
        int StartX = 0;
        int StartY = 0;

        Player player1 = new Player(100, 50);

        System.out.println("Новые координаты Х= " + player1.getPlayerMoveX());
        System.out.println("Новые координаты Y= " + player1.getPlayerMoveY());
        System.out.println(player1.toString());

        int resultX = getResultX(StartX, player1);
        int resultY = getResultY(StartY, player1);

        System.out.println("Пройденное расстояние XY= " + (resultX + resultY));
    }
//    private static int getX(int StartX, Player player1) {
//        int resultX = getResultX(StartX, player1); мы передали конструктор плайер 1 и получается мы можем любую переменную из конструктора взять
//        return resultX;

    private static int getResultX(int StartX, Player player1) {
        int resultX = StartX + player1.getPlayerMoveX();
        return resultX;
    }

    private static int getResultY(int StartY, Player player1) {
        int resultY = StartY + player1.getPlayerMoveY();
        return resultY;
    }


//         void int moveX(int StartX, Player player1) {
//            int resultX= StartX + player1.playerMoveX;
//            System.out.println(resultX);
//                   }
}
//


