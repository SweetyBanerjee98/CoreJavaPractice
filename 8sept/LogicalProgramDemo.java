/*
Program :- Write a java Program to print Logical Operations like AND,OR,NOT,XOR
@Author :- Sweety Banerjee
#Date :- 17 September 2022
##  Timing :- 23:43 pm

*/

class LogicalProgramDemo // Declaring the LogicalProgramDemo class 

{ //class start from here 

public static void main (String[]args) //Declaring the main method 

{ // Main method execution start
	
	boolean a = true; //initializing the status to a variable 
	boolean b = false; //initializing the status to b variable 
	
	System.out.println("The Status is " + (a&b)); //printing the status true or false
	System.out.println("The Status is " + (a|b)); //printing the status true or false
	System.out.println("The Status is " + (a^b)); //printing the status true or false
	System.out.println("The Status is " + ((!a)&(!b))); //printing the status true or false
	
	
	
	
} //End of the main method 


}  // End of the LogicalProgramDemo class 