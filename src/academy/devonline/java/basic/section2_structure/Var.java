package academy.devonline.java.basic.section2_structure;

import java.util.Scanner;

import static java.lang.System.getProperties;
import static java.lang.System.out;

public class Var {
    public static void main(String[] args) {
        out.println("Please enter number");

        var a = new Scanner(System.in).nextInt();
        out.println("Thanks:");
        out.println(a+1);
    }

}
