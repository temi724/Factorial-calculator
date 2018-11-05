/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_and_formulars;

import static factorial_and_formulars.Factorial_and_Formulars.anotherOperation;

/**
 *
 * @author Daniel Temtayo
 */
public class Combination extends CalculateBase {

    public Combination() {
    }

    public long Factorial(final int num) {
        if (num < 0) {
            System.err.println("No negative numbers");
            return 0;
        }
        long factorialAns = 1;
        for (int i = 1; i <= num; i++) {
            factorialAns *= i;
        }

        return factorialAns;

    }

    @Override
    public void getInput() {
        
         System.out.println("Welcome to Combination solution program");

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
        
        if(first<second)
        {
            System.err.println("FirstNumber has to be greater than Second Number");
            getInput();
        }
        else
        {
           System.out.println("Numbers accepted"); 
        }

    }

    @Override
    public void combination() {
        try {
            
            System.out.println("The formular for Combination : nCr which is n combination r = n!/(n-r)!r!");

            //n!
            long num1 = Factorial(getFirstNumber());

            //n-r  
            int num2 = getFirstNumber() - getSecondNumber();

            // (n-r)!
            long num3 = Factorial(num2);

            //r!
            long num4 = Factorial(getSecondNumber());

            //combAns is combination Answer which is n!/(n-r)!r! 
            long combAns = num1 / (num3 * num4);
            setResults(combAns);

            System.out.println("The combination of First Number and second Number is: " + getResults());
            anotherOperation();
        } catch (Exception e) {
             System.out.println(e.getMessage());
            System.out.println("To use Combination the first number has to be greater");
       
        }
    }

}


