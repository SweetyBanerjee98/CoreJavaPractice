/*
Program :- Write a Java Program To Print the day on the basis of values
@Author :- Sweety Banerjee
Date:- 19 september 2022
Timing :- 21:49pm

*/

class SwitchDayValueDemo //Declaring the SwitchDayValueDemo class

{ // SwitchDayValueDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the Main Method
	
	//input from the user
	int number = Integer.parseInt(args[0]);  //converting command line argument into Integer
	
	//switch expression is evaluted once
	switch(number) //Passing the number into the switch 
	{ //starting Switch case
	
        
		//The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
            case 1: System.out.println("The day is Sunday");//Printing the statement	
	                break;                                   // It is used to terminates the block 
			case 2: System.out.println("The day is Monday");	
	                break;
			case 3: System.out.println("The day is Tuesday");	
	                break;
			case 4: System.out.println("The day is Wednesday");	
	                break;
			case 5: System.out.println("The day is Thursday");	
	                break;
			case 6: System.out.println("The day is Friday");	
	                break;
			case 7: System.out.println("The day is Saturday");	//Printing the statement
	                break;                                      // It is used to terminates the block 
					
					
			//if there is no matching then the default code block is executed
			default : System.out.println("The entered input is invalid ");	//Printing the statement
	                
		
		
		
		
	} //End of the switch case
	   
	   
		
		
	} // End of the main Method
	
	
} //End of the SwitchDayValueDemo class 
