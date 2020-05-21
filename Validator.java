/*
 
@author: Travis Williams
Date: 5-19-2020



 */

public class Validator {
    
    public Validator() {
    
    
    }
    

    public static boolean isValidMenu(int userInput) {
       
        if (userInput == 1 || userInput == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
    
    public static boolean isValidNumber(int userChoice) {
        if (userChoice >= 1 && userChoice <= 100000) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
