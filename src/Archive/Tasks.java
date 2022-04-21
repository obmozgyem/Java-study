package Archive;


import java.util.Scanner;

class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



            for (int i = 1; i <= n; i++) {

                System.out.println();

                for (int j = 1; j <= i; j++) {
                    if (j > 1) {
                        System.out.print(" ");
                    }

                    System.out.print(j);


                }
                if (i<n) {
                    System.out.println("");
                }


            }


        }


    }

