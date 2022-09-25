/*
Program :- Write a Java Program To Print Eligible for B.TECH or not
@Author :- Sweety Banerjee
Date:- 9 september 2022
*/

class EligibleProgramDemo //Declaring the EligibleProgramDemo class

{ //EligibleProgramDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the execution of Main Method
	
	
	//Taking input from the user
	int totalMarks = Integer.parseInt(args[0]); //converting command line argument into integer
	int pcmMarks = Integer.parseInt(args[1]); //converting command line argument into integer
	   
	   
	/*------------------------------------------------------------------------------------------------------------------------------------------------*/   
	           /*                                   Nested if-else statement                           */
	/*-----------------------------------------------------------------------------------------------------------------------------------------------*/
	   
	   
	   //Run if block if the given condition is true
	    if(totalMarks>=60)
	    {
	         if((totalMarks>=80) || (pcmMarks>=85))
			    {
	
	           System.out.println("You are Eligible to take admission for B.TECH" ); // Printing the statement
		
			    }
			else 
			{
				
				System.out.println("You are Eligible to take admission (Except B.TECH) " ); // Printing the statement
			}
	    }
		
		//Run if block if the above condition is false
		else
		{
			System.out.println("You are not Eligible for our college " ); // Printing the statement
		}
		
		
	} // End of the main Method
	
	
} //End of the EligibleProgramDemo class 
