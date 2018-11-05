package factorial_and_formulars;

import static factorial_and_formulars.Factorial_and_Formulars.anotherOperation;
import java.util.Scanner;

/**
 *
 * @author Daniel Temtayo
 *
 * This class stores the method for calculating the difference of 2squares using
 * (A+B)(A-B)
 *
 *
 */
public class Difference_Of_two_Squares extends CalculateBase {

    public Difference_Of_two_Squares() {
    }

    public Difference_Of_two_Squares(int first, int second) {
        super(first, second);
    }
    
    @Override
    public void getInput(){
        
         System.out.println("Welcome to Difference of two squares solution program");
    
        System.out.println("Enter First number");
        while (!scanner.hasNextInt()) {
            System.out.println("This value has to be an Integer");
            scanner.nextLine();
        }
        int first = scanner.nextInt();
        setFirstNumber(first);
        System.out.println("Enter Second number:");
        while (!scannerB.hasNextInt()) {
            System.out.println("This value has to be an Integer");
            scannerB.nextLine();
        }
        int second = scannerB.nextInt();
        setSecondNumber(second);
    
    }

    @Override
    public void differenceOfTwoSquares() {
        try {
            
            System.out.println("The formular for Difference of two squares is (A-B)(A+B)");
            int addNumbers = getFirstNumber() + getSecondNumber();
            int subtractNumber = getFirstNumber() - getSecondNumber();
            int result = addNumbers * subtractNumber;
            setResults(result);
//            getResults();
            System.out.println("Difference of two squares:"+getResults());
            anotherOperation();

        } catch (Exception e) {
            System.out.println("");
        }

    }

}
