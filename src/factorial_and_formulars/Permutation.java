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
public class Permutation extends CalculateBase {

    public Permutation() {
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

        System.out.println("Welcome to Permutation solution program");

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
    public void permutation() {
        try {
            
             
              System.out.println("Permutation : nPr which is n permutation r = n!/(n-r)!");
              
            long num1 =Factorial(getFirstNumber()); 
       

            //n-r  
            int num3 = getFirstNumber() - getSecondNumber();

            // (n-r)!
            long num2 = Factorial(num3);

            //permAns is Permutation Answer which is n!/(n-r)! 
            long permAns = num1 / num2;

            System.out.println("The permutation of First Number and second Number is: " + permAns);
            anotherOperation();
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
}
