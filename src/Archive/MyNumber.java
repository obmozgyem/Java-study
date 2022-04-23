package Archive;

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int test[] = new int[a];

        for (int i = 0; i < a; i++) {

            test[i] = sc.nextInt();


        }
        System.out.print(test[sc.nextInt()]);
    }
}











