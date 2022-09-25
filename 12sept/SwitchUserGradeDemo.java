/*
Program :- Write a Java Program To Print the grade on the basis of charater input from user
@Author :- Sweety Banerjee
Date:- 12 september 2022

*/

class SwitchUserGradeDemo //Declaring the SwitchUserGradeDemo class

{ // SwitchUserGradeDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the Execution of Main Method
	
	
	//Taking character input from the user
	char grade = args[0].toUpperCase().charAt(0); //Converting command line argument into character
	
	//switch expression is evaluted once 
	switch(grade) //Passing the grade's value into the switch 
	{ //starting Switch case
	

         //The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
            case 'A': System.out.println("Excellent");	 //Printing the statement
	                break;                               // It is used to terminates the block 
			case 'B': System.out.println("Outstanding");	
	                break;
			case 'C': System.out.println("Well done ");	
	                break;
			case 'D': System.out.println("Can do better");	
	                break;
			case 'E': System.out.println("Very bad ");	
	                break;
			case 'F': System.out.println("Fail");	//Printing the statement
	                break;                          // It is used to terminates the block 
	            
			
			//if there is no matching then the default code block is executed
			default : System.out.println("The entered input is invalid "); //printing the statement	
	                
		
		
	} //End of the switch case
		
		
	} // End of the main Method
	
	
} //End of the SwitchUserGradeDemo class 
