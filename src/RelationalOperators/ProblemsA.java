package RelationalOperators;

import java.awt.*;
import java.util.Scanner;

public class ProblemsA {
    public static void main(String[] args) {
//        checkAscendingOrder();
//        isBetween();
//        areDifferent();
        groundhogReeses();


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

        System.out.println(h1 != h2 && h2 != h3 && h1 != h3);
    }

    /*
    Groundhogs at a party
    Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups.
    But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20 Reese's
    peanut butter cups, inclusive, unless it is the weekend, in which case they will need 15 to 25 Reese's peanut
    butter cups, inclusive.

    Write a Java program that reads two values:

    the first is the number of Reese's peanut butter cups;
    the second is a boolean representing whether it is the weekend.
    The program must print a boolean value that indicates whether the party was successful.
     */

    public static void groundhogReeses() {
        Scanner scanner = new Scanner(System.in);
        final int lowWeekend = 15;
        final int lowWeekday = 10;
        final int upperWeekend = 25;
        final int upperWeekday = 20;

        int reeses = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean b1 = reeses >= lowWeekday && reeses <= upperWeekday && !weekend;
        boolean b2 = reeses >= lowWeekend && reeses <= upperWeekend && weekend;

        System.out.println(b1 || b2);
    }
}
