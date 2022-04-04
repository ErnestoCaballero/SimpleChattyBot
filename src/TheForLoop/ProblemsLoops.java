package TheForLoop;

import java.util.Scanner;

public class ProblemsLoops {
    public static void main(String[] args) {
//        sumFromAtoB();
        fizzBuzz();
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
}
