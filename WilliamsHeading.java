/*
 
@author: Travis Williams
Date: 5-1-2020

This is the class that runs the dateTimeApp

 */

import java.text.*;
import java.util.*;

public class WilliamsHeading {
    
    public WilliamsHeading()	{}

    /* public static void main(String [] args)	
     {
            getHeader("Testing 123");
     }
    
            Got rid of main here to avoid confusion (mostly for me)
     */
    public static void getHeader(String x)	{
            String date;
            String assignNumber = x;
            String name = "Travis Williams";
            Date now = new Date();
            DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
            date = longDate.format(now);

            System.out.println("\n\n" + name);
            System.out.println(assignNumber);
            System.out.println(date);
            System.out.println();
    }// end getHeader()

}
