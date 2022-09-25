/*
Program :- Write a Java Program To Print the greater of three  numbers
@Author :- Sweety Banerjee
Date:- 9 september 2022

*/

class GreaterThreeNumber //Declaring the GreaterThreeNumber class

{ // GreaterThreeNumber class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the Main Method
	
	//Taking input from the user
	int number1 = Integer.parseInt(args[0]); //converting command line argument into integer
	int number2 = Integer.parseInt(args[1]); //converting command line argument into integer
	int number3 = Integer.parseInt(args[2]); //converting command line argument into integer
	
	   
	   //if-else if ladder statement
	   
	   //Run if block if the given condition is true
	    if((number1==number2) && (number1==number3))
	    {

	           System.out.println("All the numbers are equal" ); // Printing the statement
		
	    }
		
		//Run else if block if this given condition is true
		else if((number1>number2) && (number1>number3))
		{
			System.out.println(" Number1   " +number1 + "  is greatest" ); // Printing the statement
		}
		
		//Run else if block if this given condition is true
		else if ((number2>number3))
		{
			System.out.println(" Number2  " +number2 + "  is greatest" ); // Printing the statement
			
		}
		
		//Run else block if both the conditions are false
		else
		{
			System.out.println(" Number3  " +number3 + "  is greatest " ); // Printing the statement
			
		}
		
		
	} // End of the main Method
	
	
} //End of the GreaterThreeNumber class 
