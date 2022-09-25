/*
Program :- Write a Java Program To Print the month on the basis of the value
@Author :- Sweety Banerjee
Date:- 12 september 2022
*/

class SwitchMonthValue //Declaring the SwitchMonthValue class

{ //SwitchMonthValue class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the execution of Main Method
	
	//Taking Integer input from the user
	int value = Integer.parseInt(args[0]); //Converting command line argument into integer
	
	//switch expression is evaluted once 
	switch(value) //Passing the value into the switch 
	{ //starting switch case 
	
	      //The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
            case 1 :
			case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :System.out.println("There are 31 days ");	//Printing the statement
	                break;                                      // It is used to terminates the block 
	                


            case 2 : System.out.println("There are 28 days ");	//Printing the statement
	                break;                                      // It is used to terminates the block 
	                

            case 4 :
			case 6 :
			case 9 :
			case 11 :System.out.println("There are 30 days");	 //Printing the statement
	                break;                                       // It is used to terminates the block 
	              
			
			//if there is no matching then the default code block is executed
			default : System.out.println("The entered input is invalid ");	 //printing the statement	
	                
		
		
	} //End of the switch case
		
		
	} // End of the main Method
	
	
} //End of the SwitchMonthValue class 
