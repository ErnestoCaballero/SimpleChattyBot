package TheForLoop;

import java.util.Scanner;

public class ProblemsLoops {
    public static void main(String[] args) {
//        sumFromAtoB();
//        fizzBuzz();
        grades();
    }

    /*
    The sum of integers from a to b
    Print the sum of all integers from a to b including both.

    It is guaranteed that a < b in all test cases.
     */

    public static void sumFromAtoB() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        for (; a <= b; a++) {
            sum += a;
        }

        System.out.println(sum);
    }


    /*
    Fizz Buzz
    Fizz Buzz is a classic programming problem. Here is its slightly modified version.

    Write a program that takes two integers as the input: the beginning and the end of the interval
    (both numbers belong to the interval).

    The program should output the numbers from this interval, but if the number is divisible by 3,
    you should output Fizz instead of it; if the number is divisible by 5, output Buzz;
    and if it is divisible both by 3 and by 5, output FizzBuzz.

    Output each number or the word on a separate line.
     */

    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /*
    Grades
    Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have
    successfully passed the test.

    The program gets number n as the first line of input and then gets the grades themselves, each on a new line.

    The program must output four numbers in a single line: the number of D, C, B, and A grades (in that order),
    separated by blank space characters.
     */

    public static void grades() {
        Scanner scanner = new Scanner(System.in);

        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        String grade;

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            grade = scanner.nextLine();
            if ("A".equals(grade)) {
                numA++;
            } else if ("B".equals(grade)) {
                numB++;
            } else if ("C".equals(grade)) {
                numC++;
            } else {
                numD++;
            }
        }

        System.out.println(numD + " " + numC + " " + numB + " " + numA);
    }
}
