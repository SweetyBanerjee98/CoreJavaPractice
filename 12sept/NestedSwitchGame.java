/*
Program :- Write a Java Program To Print the game on the basis of string input from user using nested switch case
@Author :- Sweety Banerjee
Date:- 12 september 2022
*/

class NestedSwitchGame //Declaring the NestedSwitchGame class

{ // NestedSwitchGame class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the execution of Main Method
	
	//Taking String input from the user
	String game = args[0].toLowerCase(); //Converting command line argument into string
	
	
	//switch expression is evaluted once
	switch(game) //Passing the game name into the switch 
	{ //starting switch case
	                                           
											  /*    NESTED SWITCH CASE    */ 
							/*--------------------------------------------------------------------------*/
											   
        	//The value of a expression is compare with the values of each case if there is a match, the associated block of code is executed
            case "cricket" : System.out.println("I love to play Cricket"); //Printing the statement
			
			                 String position = args[1].toLowerCase(); //Taking String input 2 from the user
							 
							 switch(position)  //Passing the game position into the switch 
							 
							 { //starting switch case
								
                                case "mid-wicket" : System.out.println("I love Cricket Mid-Wicket position");	//Printing the statement
                                break;                                                                // It is used to terminates the block 
								
								case "slip" : System.out.println("I love Cricket Slip position");	
                                break;
								
								case "point" : System.out.println("I love Cricket Point position");	
                                break;
								
								case "third man" : System.out.println("I love Cricket Third man position");	//Printing the statement
                                break;                                                                // It is used to terminates the block 
                                 								
								 
								default :  System.out.println("I love all the position"); //Printing the statement
								 
								 
							 } //End of the switch case
			
                            break;	 // It is used to terminates the block 		
	               
			case "ludo" : System.out.println("I love to play Ludo");	
	                        break;
						  
			case "footbball" : System.out.println("I love to play Football");	
	                        break;
							   
			case "free fire" : System.out.println("I love to play Free Fire");	   //Printing the statement
	                        break;                                                 // It is used to terminates the block 
			
					
			default : System.out.println("The entered input is invalid ");	//Printing the statement
	                
		
		
	} //End of the switch case
		
		
	} // End of the main Method
	
	
} //End of the NestedSwitchGame class 
