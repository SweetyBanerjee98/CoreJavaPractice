/*
Program :- Write a Java Program To Print the greater of two  numbers
@Author :- Sweety Banerjee
Date:- 19 september 2022
Timing :- 21:18pm

*/

class GreaterTwoNumber //Declaring the GreaterTwoNumber class

{ //GreaterTwoNumber class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the Execution of Main Method
	
	//Taking input from the user
	int number1 = Integer.parseInt(args[0]); //converting command line argument into integer
	int number2 = Integer.parseInt(args[1]); //converting command line argument into integer
	
	   
	   //if-else if ladder statement
	   //checking the condition 
	   
	   //Run if block if the given condition is true
	    if(number1==number2) //Comparing two values 
	    { 
              
	           System.out.println("Number1  " +number1 + "  is equal to  " + number2 ); // Printing the statement
		
	    }
		
		//Run else if block if this given condition is true
		else if(number1>number2) 
		{
			System.out.println(" Number1   " +number1 + "  is greater than  " + number2 ); // Printing the statement
		}
		
		//Run else block if both the conditions are false
		else
		{
			System.out.println(" Number2  " +number2 + "  is greater than  " + number1 ); // Printing the statement
			
		}
		
		
	} // End of the main Method
	
	
} //End of the GreaterTwoNumber class 
