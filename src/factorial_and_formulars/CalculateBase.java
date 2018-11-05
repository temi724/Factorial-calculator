package factorial_and_formulars;

import java.util.Scanner;

/**
 *
 * @author Daniel Temtayo
 * @author Adeyemi Adedayo
 * @author Omoniyi Shama
 *
 * This class contains Fields and methods used throughout the e.g application
 * private int firstNumber: First Input by the user private int secondNumber:
 * second Input by the user private int gcd: Greatest common divisor private
 * long results: stores result for the operation performed
 *
 *
 */
public abstract class CalculateBase {

    Scanner scanner = new Scanner(System.in);

    Scanner scannerB = new Scanner(System.in);

    //Fields
    private int firstNumber;
    private int secondNumber;
    private int gcd;
    private long results;

    //Constructor with no parameters
    public CalculateBase() {
    }

    //constructor with parametera
    public CalculateBase(int first, int second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getGcd() {
        return gcd;
    }

    public void setGcd(int gcd) {
        this.gcd = gcd;
    }

    public long getResults() {
        return results;
    }

    public void setResults(long results) {
        this.results = results;
    }

    public void differenceOfTwoSquares() {
    }

    public void greatestCommonDivisor() {
    }

    public void lowestCommonMultiple() {
    }

    public long getFactorial() {
        return 0;
    }

    public void permutation() {
    }

    public void combination() {
    }

    public void getInput() {
    }

     
}
