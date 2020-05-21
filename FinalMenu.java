/*
 
@author: Travis Williams
Date: 5-19-2020

This is the class that runs the finalmenu

 */

import java.util.Scanner;

public class FinalMenu {
    
    public FinalMenu(){
        
        Boolean runProgram = true;
        Scanner userInput = new Scanner(System.in);
        
        while (runProgram == true) {
            

            WilliamsHeading.getHeader("Final Project");

            System.out.println("Welcome to the Flea Circus Program\n"
                    + "To begin the program, enter 1\n"
                    + "To exit the program, enter 2\n");
            
            int menuChoice = userInput.nextInt();
            
            if (Validator.isValidMenu(menuChoice) == true)
            {
                switch(menuChoice){
                    case 1:
                        System.out.println("Enter an integer between 1 and 100,000.\n");
                        int userChoice = userInput.nextInt();
                        
                        if (Validator.isValidNumber(userChoice) == true)
                        {
                            
                        }
                        else
                        {
                            System.out.println("That is an invalid choice."
                                    + "please try again.\n");
                        }
                        break;
                    case 2:
                        System.out.println("Thank you for playing.\n");
                        System.exit(0);
                }
            }
            else
            {
                System.out.println("That is an invalid response."
                        + " Please try again.\n");
                continue;
            }


            

        
        }
    }

}
