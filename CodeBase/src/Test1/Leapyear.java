package Test1;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in); 
			
	        int year = sc.nextInt();
	        sc.close();
	        
	        boolean leap = false;

	        if(year % 4 == 0)
	        {
	        	leap = true;
	        }
	        	
	        else if( year % 100 == 0)
	            {
	                // year is divisible by 400, hence the year is a leap year
	                if ( year % 400 == 0)
	                    leap = true;
	                else
	                    leap = false;
	            }
	       // leap = true;	            
//	        else
//	                leap = true;
//	        }
	        else
	            leap = false;

	        if(leap) {
	        	System.out.println( " is a leap year.");
	            Scanner sc1 = new Scanner(System.in); 
	            sc1.close();
	        }
	        else 
	            System.out.println( " is not a leap year.");
	        Scanner sc2 = new Scanner(System.in); 
	        sc2.close();
	}			
				
	}
}


