package Archive;

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                b = false;
                break;
            }
        }
       System.out.println(b);
    }
}











