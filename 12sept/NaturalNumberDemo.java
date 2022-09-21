/*
Program :- Write a Java Program To Print the 1-n natural number
@Author :- Sweety Banerjee
Date:- 20 september 2022
Timing :- 12:41 pm

*/

class NaturalNumberDemo //Declaring the NaturalNumberDemo class
{ //Starting this NaturalNumberDemo class
	
	static void integerPrint(int number) //declaring the method  & passing the parameter
	
	{ //starting the method 
		
		//For loop executed number of time repeateatly until the given condition return false
		for(int i= 1; i<=number ; i++)
		{ //starting
			
			System.out.println("The Natural number is : ---------------------------------------- "); //printing the statement
			System.out.println(); //for new line 
			System.out.println(i); //Printing the i value
			
		}  //ending the loop block
		
	} //ending the method


//declaring the main method 
public static void main (String[]args)

{ //starting the main method 
	
	
	//taking integer input from the user
	int number = Integer.parseInt(args[0]); //converting command line argument into integer
	
	integerPrint(number); //Calling the multiplication method 
	
	
	
} //end of the main method

} //Ending the NaturalNumberDemo class