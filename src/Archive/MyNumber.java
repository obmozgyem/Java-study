package Archive;

/*
Решил без массивов, просто 3 переменные x- считает длину слова, num - номер итерации и
xmax = num если слово имеет наименьшую длину,
1 цикл while(sc.hasNext()) внутри которого
первой итерацией приравниваем x = word.length(); где String word = sc.next();
 */

import java.util.*;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int [n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (i+1)*(j+1);
                System.out.print(j==m-1 ? arr[i][j] : arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}




























