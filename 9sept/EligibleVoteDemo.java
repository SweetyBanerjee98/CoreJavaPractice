/*
Program :- Write a Java Program To Print a person is Eligible for vote or not
@Author :- Sweety Banerjee
Date:- 18 september 2022
Timing :- 23:18pm

*/

class EligibleVoteDemo //Declaring the EligibleVoteDemo class

{ //EligibleVoteDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting execution of the Main Method
	
	//Taking input from the user
	int age = Integer.parseInt(args[0]); //converting command line argument into integer
	
	   
	   // if-else statement
	   
	   //Run if block if the given condition is true
	    if(age>=18) //if age is greater than 18 
	    {

	           System.out.println("You are Eligible for vote" ); // Printing the statement
		
	    }
		
		//Run else block if the condition is false
		else
		{
			System.out.println("You are not Eligible for vote " ); // Printing the statement
		}
		
		
	} // End of the main Method
	
	
} //End of the EligibleVoteDemo class 
