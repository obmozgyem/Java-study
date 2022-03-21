package Archive.second;

public class Arrays {
    public static void main(String[] args) {
        //объявляем и создаём массив, указывая только количество строк
        int[][] arrays = new int[5][];

//инициализируем массив, заполняя его массивами разной длины
//        twoDimArray[0] = new int[]{1, 2, 3, 4, 5};
//        twoDimArray[1] = new int[]{1,2,3,4};
//        twoDimArray[2] = new int[]{1,2,3};
//        twoDimArray[3] = new int[]{1,2};
//        twoDimArray[4] = new int[]{1};
        arrays[0] = new int[]{5};
        arrays[1] = new int[]{1, 2};
        arrays[2] = new int[]{1, 2, 3};
//        twoDimArray[3] = new int[]{1,2};
        for (int i = 0; i < arrays.length; i++) {
                        for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(" " + (arrays[i][j]+2) + " ");
            }
            System.out.println();
        }
    }
}

