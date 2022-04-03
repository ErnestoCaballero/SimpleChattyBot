package ConditionalStatement;

import java.util.Scanner;

public class ProblemsA {
    public static void main(String[] args) {
//        armyUnits();
//        isLeap();
//        isSymmetrical();
//        sleepWell();
//        isTriangle();
        givenInterval();
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
    public static void isLeap() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }

    /*
    Given a four-digit number, determine whether its decimal notation is symmetric.
    If the number is symmetric, output 1; otherwise, output any other integer.
     */

    public static void isSymmetrical() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int firstDigit = input % 10;
        int secondDigit = (input % 100 - firstDigit) / 10;
        int thirdDigit = (input % 1_000 - secondDigit * 10 - firstDigit) / 100;
        int fourthDigit = (input % 10_000 - thirdDigit * 100 - secondDigit * 10 - firstDigit) / 1_000;
        System.out.println("first: " + firstDigit + "\nsecond: " + secondDigit + "\nthird: " + thirdDigit +
                "\nfourth: " + fourthDigit);

        if (fourthDigit == firstDigit && thirdDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(7);
        }

    }

    /*
    Healthy sleep
    Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
    She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

    You are given three numbers: AA, BB and HH. According to TV, one should sleep at least AA hours per day,
    but no more than BB hours. HH is how many hours Ann sleeps.

    Task: If Ann sleeps less then AA hours, print "Deficiency". If she sleeps more than BB hours, print "Excess".
    If her sleep fits the recommendations, print "Normal".

    Input format: three numbers AA, BB, HH, where AA is always less than or equal to BB.
     */
    public static void sleepWell() {
        Scanner scanner = new Scanner(System.in);

        int minSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int hoursSlept = scanner.nextInt();

        System.out.println(hoursSlept < minSleep ? "Deficiency"
                : hoursSlept > maxSleep ? "Excess"
                : "Normal");
    }

    /*
    Triangle
    Given three natural numbers A, B, and C. Determine if a triangle with these sides can exist.

    If the triangle exists, output the "YES" string; otherwise, output "NO".

    A triangle is valid if the sum of its two sides is greater than the third side. If three sides are A, B, and C,
    then three conditions should be met.
     */

    public static void isTriangle() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b > c && a + c > b && b + c > a ? "YES": "NO");
    }

    /*
    INTERVAL
    Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞).
    Otherwise, print False (case sensitive).

    Notes:

    numbers denoted with a parenthesis () are exclusive;
    numbers denoted with a square bracket [] are inclusive.
     */

    public static void givenInterval() {
        Scanner scanner = new Scanner(System.in);
        final int lowerOne = -15;
        final int lowerTwo = 12;
        final int middleOne = 14;
        final int middleTwo = 17;
        final int upperOne = 19;
        int input = scanner.nextInt();

        boolean firstInterval = input > lowerOne && input <= lowerTwo;
        boolean secondInterval = input > middleOne && input < middleTwo;
        boolean thirdInterval = input >= upperOne;

        System.out.println(firstInterval
                || secondInterval
                || thirdInterval ? "True" : "False");
    }
}
