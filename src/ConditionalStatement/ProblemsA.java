package ConditionalStatement;

import java.util.Scanner;

public class ProblemsA {
    public static void main(String[] args) {
        armyUnits();

    }

    /*
    The army of units
    In a computer game, each gamer has an army of units.

    Write a method that will classify the army of your enemies corresponding to the following rules:
    Units: Category
    less than 1: no army
    from 1 to 19: pack
    from 20 to 249: throng
    from 250 to 999: zounds
    1000 and more: legion
    The program should read the number of units and output the corresponding category.
     */

    public static void armyUnits() {
        Scanner scanner = new Scanner(System.in);
        final int noArmy = 1;
        final int pack = 19;
        final int throng = 249;
        final int zounds = 999;
        int units = scanner.nextInt();

        if (units < noArmy) {
            System.out.println("no army");
        } else if (units <= pack) {
            System.out.println("pack");
        } else if (units <= throng) {
            System.out.println("throng");
        } else if (units <= zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }

    /*
    Leap year
    Find whether the given year is a leap year.

    Just a reminder: leap years are those years in which the year’s number is either divisible by 4,
    but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year,
    but the year 2100 will not be a leap year).

    The program should work correctly for the years 1900 ≤ n ≤ 3000.

    Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.

    It is enough to write a simple conditional statement to solve this task.


     */
}
