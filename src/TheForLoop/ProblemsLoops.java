package TheForLoop;

import java.util.Scanner;

public class ProblemsLoops {
    public static void main(String[] args) {
        sumFromAtoB();

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
}
