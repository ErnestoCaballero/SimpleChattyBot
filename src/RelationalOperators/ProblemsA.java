package RelationalOperators;

import java.awt.*;
import java.util.Scanner;

public class ProblemsA {
    public static void main(String[] args) {
//        checkAscendingOrder();
        isBetween();
    }

    /*
    Boys in a sport class
    Suppose there are three boys in a sports class.
    You need to write a function that checks if the boys are arranged in ascending or descending order by height.
    The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height,
    they are considered as correctly arranged.
     */
    public static void checkAscendingOrder() {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        System.out.println((h1 <= h2 && h2 <= h3) || (h1 >= h2 && h2 >= h3));

    }

    /*
    Is between
    Write a function that reads three integer numbers and prints true if the first number is between
    the second and the third one (inclusive). Otherwise, it must print false.

    The last two arguments may not be sorted.
     */
    public static void isBetween() {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        System.out.println(h1 <= h3 && h1 >= h2 || h1 <= h2 && h1 >= h3);
    }

    /*
    Check the given numbers are different
    Write a function that reads three numbers and checks that they all are different, i.e. not equal to one another.
    The output should be true or false.
     */

    public static void areDifferent() {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        System.out.println(h1 != h2 && h2 != h3);
    }
}
