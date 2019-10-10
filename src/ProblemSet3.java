/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        // ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        // ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

      System.out.print("\nEnter an integer: ");
      long input = in.nextLong();

      if ((input / 2) > 0) {
        System.out.println("\nPositive.");
      } else if (input / 2 == 0) {
        System.out.println("\nZero.");
      } else if (input / 2 < 0) {
        System.out.println("\nNegative.");
      }

    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {

      System.out.print("\nEnter an integer: ");
      long input = in.nextLong();

      if (input % 2 == 0) {
        System.out.println("\nEven.");
      } else if (input % 2 != 0) {
        System.out.println("\nOdd.");
      }

    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {

      System.out.println("\nEnter three integers.");

      System.out.print("\nEnter integer: ");
      long inputOne = in.nextLong();
      System.out.print("Enter integer: ");
      long inputTwo = in.nextLong();
      System.out.print("Enter integer: ");
      long inputThree = in.nextLong();

      if (inputTwo > inputOne && inputThree > inputTwo) {
        System.out.println("\nStrictly increasing.");
      } else if ((inputTwo >= inputOne && inputThree >= inputTwo) && (inputOne != inputThree || inputTwo != inputThree)) {
        System.out.println("\nIncreasing.");
      } else if (inputOne == inputTwo && inputOne == inputThree) {
        System.out.println("\nSame.");
      } else if ((inputTwo <= inputOne && inputThree <= inputTwo) && (inputOne != inputThree || inputTwo != inputThree)) {
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }

    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

      final double GRADE_A = 4.00;
      final double GRADE_B = 3.00;
      final double GRADE_C = 2.00;
      final double GRADE_D = 1.00;
      final double GRADE_F = 0.00;
      final double PLUS = 0.33;
      final double MINUS = 0.33;

      System.out.print("\nEnter a letter grade: ");
      String grade = in.nextLine();
      String letter = String.valueOf(grade.charAt(0));
      String symbol = "";
      double gpaVar = 0.00;
      try {
        symbol = String.valueOf(grade.charAt(1));
      } catch (Exception e) {

      }

      if (letter.equals("A")) {
        gpaVar = GRADE_A;
      } else if (letter.equals("B")) {
        gpaVar = GRADE_B;
      } else if (letter.equals("C")) {
        gpaVar = GRADE_C;
      } else if (letter.equals("D")) {
        gpaVar = GRADE_D;
      } else if (letter.equals("F")) {
        gpaVar = GRADE_F;
      } else {
        System.out.println("\nThat's not a valid letter grade.");
      }

      if (letter.equals("F")) {
        if (symbol.equals("+")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else if (symbol.equals("-")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (letter.equals("A")) {
        if (symbol.equals("+")) {
          System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
        } if (symbol.equals("-")) {
          gpaVar -= 0.33;
          System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
        } else {
          System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
        }
      } else if (symbol.equals("+")) {
        gpaVar += PLUS;
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (symbol.equals("-")) {
        gpaVar -= MINUS;
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (symbol.equals("")) {
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

      final int A_MAXIMUM = 100;
      final int A_MINIMUM = 90;
      final int B_MAXIMUM = 89;
      final int B_MINIMUM = 80;
       
      System.out.print("\nEnter a grade: ");

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
