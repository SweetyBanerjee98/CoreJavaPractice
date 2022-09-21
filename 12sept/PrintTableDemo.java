/*
Program :- Write a Java Program To Print the Print Table
@Author :- Sweety Banerjee
Date:- 20 september 2022
Timing :- 12:56 pm

*/

class PrintTableDemo //Declaring the PrintTableDemo class
{ //Starting this PrintTableDemo class
	
	static void multiplication(int number) //declaring the method  & passing the parameter
	
	{ //starting the method 
		
		//For loop executed number of time repeateatly until the given condition return false
		for(int i= 1; i<=10; i++)
		{ //starting
			
			System.out.println(number  +" * "+  i  +" = " + number * i );  // Given the output
			
		}//ending the loop block
		
	} //ending the method 
	

//declaring the main method 
public static void main (String[]args) 

{ //starting the main method 
	 
	 //taking integer input from the user
	int number = Integer.parseInt(args[0]); //converting command line argument into integer
	
	multiplication(number); //Calling the multiplication method 
	 
	
	
} //end of the main method


}//Ending the PrintTableDemo class