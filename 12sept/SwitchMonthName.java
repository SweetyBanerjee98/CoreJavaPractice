/*
Program :- Write a Java Program To Print the month on the basis of the month name
@Author :- Sweety Banerjee
Date:- 19 september 2022
Timing :- 22:08 pm

*/

class SwitchMonthName //Declaring the SwitchMonthName class

{ //SwitchMonthName class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the execution of Main Method
	
	
	//Taking String input from the user
	String monthName = args[0].toLowerCase(); //Converting command line argument into string
	
	//switch expression is evaluted once
	switch(monthName) //Passing the monthname into the switch 
	{ //starting switch case
	
	//The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
            case "january" :
			case "march" :
            case "may" :
            case "july" :
            case "august" :
            case "october" :
            case "december" :System.out.println("There are 31 days ");	//Printing the statement
	                break;                                      // It is used to terminates the block 
	                


            case "february" : System.out.println("There are 28 days ");	//Printing the statement
	                break;                                      // It is used to terminates the block 
	           

            case "april" :
			case "june" :
			case "september" :
			case "november" :System.out.println("There are 30 days");	//Printing the statement
	                break;                                      // It is used to terminates the block 
	              
			
			//if there is no matching then the default code block is executed
			default : System.out.println("The entered input is invalid ");	//Printing the statement
	                
		
		
	} //End of the switch case
		
		
	} // End of the main Method
	
	
} //End of the SwitchMonthName class 
