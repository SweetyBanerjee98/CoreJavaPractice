/*
Program :- Write a Java Program To Print the Infinite Loop
@Author :- Sweety Banerjee
Date:- 20 september 2022
Timing :- 13:19 pm

*/

class InfiniteDemo //Declaring the InfiniteDemo class
{ //Starting this InfiniteDemo class
	
	static void infiniteLoop() //declaring the method  & passing the parameter
	
	{ //starting the method 
		
	/*      Infinite loop     */
	/*------------------------------------*/
		for(;;) //running continuously for an indefinite number of times  
		{ //starting
			
			System.out.println(" Hello Sweety " );  // printing this statement for an indefinite number of times 
			
		} //ending the loop block
		
	} //ending the method
	
	
//declaring the main method 
public static void main (String[]args)

{ //starting the main method 
	
	infiniteLoop(); //Calling the InfiniteLoop method 
		
} //end of the main method


} //Ending the InfiniteDemo class