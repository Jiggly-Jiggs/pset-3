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

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

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
      in.nextLine();

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
      String letterGrade = in.nextLine();
      String letter = String.valueOf(letterGrade.charAt(0));
      String symbol = "";
      double gpaVar = 0.00;
      try {
        symbol = String.valueOf(letterGrade.charAt(1));
      } catch (Exception e) {

      }

      if (letter.equals("A")) {
        gpaVar = GRADE_A;
      } else if (letter.equals("a")) {
        gpaVar = GRADE_A;
      } else if (letter.equals("B")) {
        gpaVar = GRADE_B;
      } else if (letter.equals("b")) {
        gpaVar = GRADE_B;
      } else if (letter.equals("C")) {
        gpaVar = GRADE_C;
      } else if (letter.equals("c")) {
        gpaVar = GRADE_C;
      } else if (letter.equals("D")) {
        gpaVar = GRADE_D;
      } else if (letter.equals("d")) {
        gpaVar = GRADE_D;
      } else if (letter.equals("F")) {
        gpaVar = GRADE_F;
      } else if (letter.equals("f")) {
        gpaVar = GRADE_F;
      } else {
        System.out.println("\nThat's not a valid letter grade.");
      }

      if (letter.equals("F") || letter.equals("f")) {
        if (symbol.equals("+")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else if (symbol.equals("-")) {
          System.out.println("\nThat's not a valid letter grade.");
        } else System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
      } else if (letter.equals("A") || letter.equals("a")) {
        if (symbol.equals("+")) {
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

      final double A_MAXIMUM = 100;
      final double A_MINIMUM = 90;
      final double B_MAXIMUM = 89;
      final double B_MINIMUM = 80;
      final double C_MAXIMUM = 79;
      final double C_MINIMUM = 70;
      final double D_MAXIMUM = 69;
      final double D_MINIMUM = 60;
      final double F_MAXIMUM = 59;
      final double F_MINIMUM = 0;

      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();
      in.nextLine();

      if (numberGrade <= A_MAXIMUM && numberGrade >= A_MINIMUM) {
          System.out.println("\nYou recieved an A.");
      } else if (numberGrade <= B_MAXIMUM && numberGrade >= B_MINIMUM) {
          System.out.println("\nYou recieved a B.");
      } else if (numberGrade <= C_MAXIMUM && numberGrade >= C_MINIMUM) {
          System.out.println("\nYou recieved a C.");
      } else if (numberGrade <= D_MAXIMUM && numberGrade >= D_MINIMUM) {
          System.out.println("\nYou recieved a D.");
      } else if (numberGrade <= F_MAXIMUM && numberGrade >= F_MINIMUM) {
          System.out.println("\nYou recieved an F.");
      } else if (numberGrade < 0) {
          System.out.println("\nGrades below 0 are invalid.");
      } else if (numberGrade > 100) {
          System.out.println("\nGrades above 100 are invalid.");
      }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

      System.out.print("\nEnter a card: ");
      String card = in.nextLine();
      String rank = card.substring(0, 1);
      String suit = card.substring(1);
      String rankWord = "";
      String suitWord = "";
      boolean valid = false;

      if (suit.equals("C")) {
        suitWord = "Clubs";
        valid = true;
      } else if (suit.equals("c")) {
        suitWord = "Clubs";
        valid = true;
      } else if (suit.equals("D")) {
        suitWord = "Diamonds";
        valid = true;
      } else if (suit.equals("d")) {
        suitWord = "Diamonds";
        valid = true;
      } else if (suit.equals("H")) {
        suitWord = "Hearts";
        valid = true;
      } else if (suit.equals("h")) {
        suitWord = "Hearts";
        valid = true;
      } else if (suit.equals("S")) {
        suitWord = "Spades";
        valid = true;
      } else if (suit.equals("s")) {
        suitWord = "Spades";
        valid = true;
      } else {
        valid = false;
        System.out.println("\nThat's not a valid suit.");
      }

      if (valid) {
        if (rank.equals("2")) {
          rankWord = "Two";
        } else if (rank.equals("3")) {
          rankWord = "Three";
        } else if (rank.equals("4")) {
          rankWord = "Four";
        } else if (rank.equals("5")) {
          rankWord = "Five";
        } else if (rank.equals("6")) {
          rankWord = "Six";
        } else if (rank.equals("7")) {
          rankWord = "Seven";
        } else if (rank.equals("8")) {
          rankWord = "Eight";
        } else if (rank.equals("9")) {
          rankWord = "Nine";
        } else if (rank.equals("T")) {
          rankWord = "Ten";
        } else if (rank.equals("t")) {
          rankWord = "Ten";
        } else if (rank.equals("J")) {
          rankWord = "Jack";
        } else if (rank.equals("j")) {
          rankWord = "Jack";
        } else if (rank.equals("Q")) {
          rankWord = "Queen";
        } else if (rank.equals("q")) {
          rankWord = "Queen";
        } else if (rank.equals("K")) {
          rankWord = "King";
        } else if (rank.equals("k")) {
          rankWord = "King";
        } else if (rank.equals("A")) {
          rankWord = "Ace";
        } else if (rank.equals("a")) {
          rankWord = "Ace";
        } else {
          valid = false;
          System.out.println("\nThat's not a valid rank.");
        }
      }

      if (valid) {
        System.out.println("\n" + rankWord + " of " + suitWord + ".");
      }

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

      System.out.print("\nEnter a year: ");
      long year = in.nextLong();

      if (year >= 0) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          System.out.println("\n" + year + " is a leap year.");
        } else {
          System.out.println("\n" + year + " is not a leap year.");
        }
      }

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

      final double C_FREEZING = 0;
      final double C_BOILING = 100;
      final double F_FREEZING = 32;
      final double F_BOILING = 212;

      System.out.print("\nEnter a temperature: ");
      double temperature = in.nextDouble();
      in.nextLine();
      System.out.print("Enter a scale: ");
      String scale = in.nextLine();

      if (scale.equals("C") || scale.equals("c")) {
        if (temperature >= C_BOILING) {
          System.out.println("\nGas.");
        } else if (temperature <= C_FREEZING) {
          System.out.println("\nSolid.");
        } else if (temperature < C_BOILING && temperature > C_FREEZING) {
          System.out.println("\nLiquid.");
        }
      }

      if (scale.equals("F") || scale.equals("f")) {
        if (temperature >= F_BOILING) {
          System.out.println("\nGas.");
        } else if (temperature <= F_FREEZING) {
          System.out.println("\nSolid.");
        } else if (temperature < F_BOILING && temperature > F_FREEZING) {
          System.out.println("\nLiquid.");
        }
      }

      if (!(scale.equals("C") || scale.equals("c")) && !(scale.equals("F") || scale.equals("f"))) {
        System.out.println("\nThat's not a valid scale.");
      }

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

      System.out.print("\nEnter a month: ");
      String month = in.nextLine();
      month = month.toLowerCase();

      if (month.equals("january")) {
        System.out.println("\n31 days.");
      } else if (month.equals("february")) {
        System.out.println("\n28 or 29 days.");
      } else if (month.equals("march")) {
        System.out.println("\n31 days.");
      } else if (month.equals("april")) {
        System.out.println("\n30 days.");
      } else if (month.equals("may")) {
        System.out.println("\n31 days.");
      } else if (month.equals("june")) {
        System.out.println("\n30 days.");
      } else if (month.equals("july")) {
        System.out.println("\n31 days.");
      } else if (month.equals("august")) {
        System.out.println("\n31 days.");
      } else if (month.equals("september")) {
        System.out.println("\n30 days.");
      } else if (month.equals("october")) {
        System.out.println("\n31 days.");
      } else if (month.equals("november")) {
        System.out.println("\n30 days.");
      } else if (month.equals("december")) {
        System.out.println("\n31 days.");
      } else {
        System.out.println("\nThat's not a valid month.");
      }

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

      final double OVERTIME_THRESHOLD = 40;
      final double OVERTIME_PAY_MULTIPLIER = 1.5;

      System.out.print("\nWage: ");
      double wage = in.nextDouble();

      if (wage < 0) {
        System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
      }

      System.out.print("Hours: ");
      double hours = in.nextDouble();

      if (hours < 0) {
        System.out.println("\nYour hours must be greater than or equal to 0.0.");
      }

      double hoursOT;
      double pay;

      if (hours > OVERTIME_THRESHOLD) {
        hoursOT = hours - OVERTIME_THRESHOLD;
        pay = 40 * wage + hoursOT * OVERTIME_PAY_MULTIPLIER * wage;
        System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
      } else {
        pay = wage * hours;
        System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
      }
    }
}
