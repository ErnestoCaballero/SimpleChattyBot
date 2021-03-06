package TheForLoop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ProblemsLoops {
    public static void main(String[] args) {
//        sumFromAtoB();
//        fizzBuzz();
//        grades();
//        gradesMaps();
//        rangeDivisibleN();
//        productInRange();
//        sumDivisibleBySix();
//        maxDivisibleByFour();
//        sizeOfParts();
        meanRangeDivisibleThree();


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

    public static void gradesMaps() {
        HashMap<String, Integer> gradesMap = buildGradesMap();

        fillGradesMap(gradesMap);

        System.out.printf("%d %d %d %d", gradesMap.get("D"), gradesMap.get("C"), gradesMap.get("B"), gradesMap.get("A"));
    }

    private static HashMap<String, Integer> buildGradesMap() {
        return new LinkedHashMap<>() {
            {
                put("A", 0);
                put("B", 0);
                put("C", 0);
                put("D", 0);
            }
        };
    }

    private static void fillGradesMap(HashMap<String, Integer> gradesMap) {
        Scanner scanner = new Scanner(System.in);

        String grade;
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfStudents; i++) {
            grade = scanner.nextLine();

            gradesMap.put(grade, gradesMap.get(grade) + 1);
        }

        scanner.close();
    }

    /*
    The count of numbers divisible by N
    Write a program that reads three positive integers a, b, n and outputs the count of numbers divisible by n in
    the range from a to b (a < b) inclusively.

    Note: it is possible to write this program more efficiently without any loops.
     */

    public static void rangeDivisibleN() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int countDivisible = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                countDivisible++;
            }
        }

        System.out.println(countDivisible);
    }

    /*
    The product of numbers from a to b
    Write a program that prints the product of all integer numbers from a to b (a < b).
    Include a and exclude b from the product.
     */

    public static void productInRange() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int accumulator = 1;

        for (int i = a; i < b; i++) {
            accumulator *= i;
        }

        System.out.println(accumulator);
    }

    /*
    Numbers divisible by six
    Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

    The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

    It is guaranteed that there is always a number divisible by 6 in the sequence.
     */

    public static void sumDivisibleBySix() {
        final int divisor = 6;
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int sum = 0;
        int input;

        for (int i = 0; i < iterations; i++) {
            input = scanner.nextInt();
            scanner.nextLine();
            if (input % divisor == 0) {
                sum += input;
            }
        }

        System.out.println(sum);

    }

    /*
    Maximum element divisible by four
    Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
    There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.

    As input, the program receives the number of elements in the sequence n (first line) and then the elements
    themselves (next n lines). The program should print a single number: the maximum element of the sequence divisible by 4.

    Try to solve this problem by using a for-loop.
     */

    public static void maxDivisibleByFour() {
          Scanner scanner = new Scanner(System.in);
          final int divisor = 4;
          int len = scanner.nextInt();
          int number;
          int max = 0;

          for (int i = 0; i < len; i++) {
              number = scanner.nextInt();
              max = number % divisor == 0 && number > max ? number : max;
          }

        System.out.println(max);
    }

    /*
    Size of parts
    A detector compares the size of parts produced by a machine with the reference standard.

    If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
    If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
    If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.

    Write a program, which takes the numb;er of parts n as input, and then the sequence of detector prints.
    The program should output numbers in a single line containing the number of parts ready to be shipped,
    the number of parts to be fixed, and the number of rejects.
     */

    public static void sizeOfParts() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int part;
        int countPerfect = 0;
        int countLarger = 0;
        int countSmaller = 0;

        for (int i = 0; i < n; i++) {
            part = scanner.nextInt();
            if (part == 0) {
                countPerfect++;
            } else if (part == 1) {
                countLarger++;
            } else {
                countSmaller++;
            }
        }

        System.out.printf("%d %d %d", countPerfect, countLarger, countSmaller);
    }

    /*
    Arithmetic average
    Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the
    arithmetic average of all numbers from the interval [a; b][a;b], which are divisible by 33.

    In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12][???5;12].
    On this interval, there are 66 numbers divisible by 33, namely: -3, 0, 3, 6, 9, 12???3,0,3,6,9,12.
    Their arithmetic average equals 4.54.5.

    The program input contains intervals, which always contain at least one number, which is divisible by 33.

    Remember that the int type cannot contain fractions. Use a double variable to store the precise result of the division.
     */

    public static void meanRangeDivisibleThree() {
        Scanner scanner = new Scanner(System.in);
        final int divisor = 3;
        double sumDivisible = 0;
        int countDivisible = 0;

        for (int i = scanner.nextInt(), b = scanner.nextInt(); i <= b; i++) {
            if (i % divisor == 0) {
                sumDivisible += i;
                countDivisible++;
            }
        }

        System.out.println(sumDivisible / countDivisible);

    }

}
