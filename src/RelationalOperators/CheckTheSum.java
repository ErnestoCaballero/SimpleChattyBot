package RelationalOperators;

/*
Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.

The program must output true or false.
 */

import java.util.Scanner;

public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int refValue = 20;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b == refValue || a + c == refValue || b + c == refValue);
    }
}
