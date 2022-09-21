/*
Program :- Write a Java Program To Print the game on the basis of string input from user using Enhanced switch case
@Author :- Sweety Banerjee
Date:- 20 september 2022
Timing :- 11:45 am

*/

class EnhancedGameDemo //Declaring the EnhancedGameDemo class

{ // EnhancedGameDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the execution of Main Method
	
	//Taking String input from the user
	String game = args[0].toLowerCase(); //Converting command line argument into string
	
	//switch expression is evaluted once
	switch(game) //Passing the game name into the switch 
	{ //starting switch case
	                                
									         /*   ENHANCED SWITCH CASE     */
                         /*-----------------------------------------------------------------------------------*/
			
			
			
			//The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
			
            case "cricket"-> System.out.println("I love to play Cricket");	//Printing the statement
	               
			case "ludo" -> System.out.println("I love to play Ludo");	//Printing the statement
	               
			case "footbball"-> System.out.println("I love to play Football");	//Printing the statement
	               
			case "free fire"-> System.out.println("I love to play Free Fire");	//Printing the statement
	              
					
			default -> System.out.println("The entered input is invalid ");	//Printing the statement
	                
		
		
	} //End of the switch case
		
		
	} // End of the main Method
	
	
} //End of the EnhancedGameDemo class 
