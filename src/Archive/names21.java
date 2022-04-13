package Archive;

import java.util.*;

class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;

        int y = 0;

        int z = -1;

        while (sc.hasNextInt())

        {int a = sc.nextInt();

            if(a % 11 == 0)

                x = a;

            z = x / x + z;

            if(x % 3 == 0)

                y =   x + y;

        }

        System.out.println(z);

        System.out.print(y - x);

    }

}
