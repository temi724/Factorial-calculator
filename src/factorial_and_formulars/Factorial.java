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
public class Factorial extends CalculateBase {

    public Factorial() {
    }

      @Override
    public void getInput(){
        
         System.out.println("Welcome to Factorial solution program");
    
        System.out.println("Enter number");
        while (!scanner.hasNextInt()) {
            System.out.println("This value has to be an Integer");
            scanner.nextLine();
        }
        int first = scanner.nextInt();
        setFirstNumber(first);
       
    }
    
    @Override
    public long getFactorial() {
          try {
             
  int num = getFirstNumber();

        if (num < 0) {
            System.err.println("No negative numbers");
            return 0;
        }
        long factorialAns = 1;
        for (int i = 1; i <= num; i++) {
            factorialAns *= i;
        }
        setResults(factorialAns);
              System.out.println("Factorial:"+ getResults());
              anotherOperation();
        } catch (Exception e) {
        }
        return 0;
        
      

    }


    
}

