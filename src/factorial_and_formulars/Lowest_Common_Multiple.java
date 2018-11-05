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
public class Lowest_Common_Multiple extends CalculateBase {

    public Lowest_Common_Multiple() {
    }

    public Lowest_Common_Multiple(int first, int second) {
        super(first, second);
    }

    @Override
    public void getInput() {
        
         System.out.println("Welcome to Lowest Common Multiple solution program");

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
    public void lowestCommonMultiple() {
        try {
            int a = getFirstNumber();
            int b = getSecondNumber();
            int lcm = (a == b || a == 1) ? a : (a == 1 ? b : 0);
            if (lcm == 0) {
                int mm = a, nn = b;
                while (mm != nn) {
                    while (mm < nn) {
                        mm += a;
                    }
                    while (nn < mm) {
                        nn += b;
                    }
                }
                lcm = mm;
                setResults(lcm);
                System.out.println("LCM:"+getResults());
                anotherOperation();
            }
        } catch (Exception e) {
            System.out.println("Use real numbers");
        }

    }

}
