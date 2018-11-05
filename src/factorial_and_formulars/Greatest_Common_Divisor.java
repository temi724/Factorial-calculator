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
public class Greatest_Common_Divisor extends CalculateBase {

    public Greatest_Common_Divisor() {
    }

    public Greatest_Common_Divisor(int first, int second) {
        super(first, second);
    }

    @Override
    public void getInput() {
        
        System.out.println("Welcome to Greatest Common Divisor solution Program");


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
    public void greatestCommonDivisor() {
        try {
            int a = getFirstNumber();
            int b = getSecondNumber();
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;

            }
            setResults(a);
            System.out.println("Greatest common divisor:" + getResults());
            anotherOperation();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
