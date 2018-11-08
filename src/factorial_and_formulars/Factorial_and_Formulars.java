/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_and_formulars;

import java.util.Scanner;

/**
 *
 * @author Daniel Temitayo
 * @author Adeyemi Adedayo
 * @author Omoniyi Shama
 *
 */
public class Factorial_and_Formulars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial_and_Formulars f = new Factorial_and_Formulars();
        f.menu();
        homepage();

    }

    private static void homepage() {
        System.out.println("Welcome to Factorials and Numbers ");
        System.out.println("******************************** ");
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select From the available option to use the application(1-7)");
        System.out.println("******************************** ");
        System.out.println("1. Difference of two squares");
        System.out.println("2. Calculate Greatest Common Divisor");
        System.out.println("3. Calculate Lowest Common multiple");
        System.out.println("4. Calculate Factorial");
        System.out.println("5. Calculate permutation");
        System.out.println("6. Calculate Combination");
        System.out.println("7. Cancel");
        System.out.println("***********************************************");
        System.out.println("Enter option now:");

        //Making sure use enter valid input.......
        while (!scanner.hasNextInt()) {
            System.out.println("Use Integer (1-7)");
            scanner.nextLine();
        }

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                Difference_Of_two_Squares D = new Difference_Of_two_Squares();
                D.getInput();
                D.differenceOfTwoSquares();
                break;
            case 2:
                Greatest_Common_Divisor G = new Greatest_Common_Divisor();
                G.getInput();
                G.greatestCommonDivisor();
                break;
            case 3:
                Lowest_Common_Multiple L = new Lowest_Common_Multiple();
                L.getInput();
                L.lowestCommonMultiple();
                break;
            case 4:
                Factorial F = new Factorial();
                F.getInput();
                F.getFactorial();
                break;
            case 5:
                Permutation P = new Permutation();
                P.getInput();
                P.permutation();
                break;
            case 6:
                Combination C = new Combination();
                C.getInput();
                C.combination();
                break;
            case 7:
                cancel();
                break;
            default:
                System.out.println("Invalid Option! \n Please Choose a Valid Option");
                anotherOperation();
        }
    }

    public static void anotherOperation() {
        System.out.println("Do you want to perform another operation?");
        System.out.println("Y- YES");
        System.out.println("N - NO");
        Scanner c = new Scanner(System.in);
        char ans = c.next().charAt(0);
        switch (ans) {
            case 'y':
            case 'Y':
                Factorial_and_Formulars m = new Factorial_and_Formulars();
                m.menu();
                break;
            case 'n':
            case 'N':
                System.out.println("Thank you for using the system");
                System.exit(0);
            default:
                System.out.println("Choose a valid option\n Use Y for Yes or N for No");
                anotherOperation();
                break;
        }
    }

    private static void cancel() {
        System.out.println("Thanks for using the system");
        System.exit(0);
    }

}
