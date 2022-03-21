package Archive.second;

public class Example4 {
    public static void main(String[] args) {
        //Даны 2 числа, a – целое, n – целое положительное. Используя цикл, найти результат возведения a в степень n.
        int a = 2;
        int n = 4;
        int result = exponen(a, n);
        System.out.println(result);
    }

    public static int exponen(int a, int n) {
        int result = a; //
        for (int i = 0; i < n-1; i++) {
            result = result * a;
        }
        return result;
    }

}
