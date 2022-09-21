/*
Program :- Write a java program to print the Increment Decrement Operation
@Author :- Sweety Banerjee
#Date :- 17 September 2022
#Timing :- 21:37 pm

*/


class IncrementDecrementProgram //Declaring the IncrementDecrementProgram class

{ //Class start from here

public static void main (String[]args) //Declaring the Main Method 

{ //Main Method Execution start From here 
	
	//Post_Increment & Pre_Increment Operator
	
	int a = 20; //store the value of a variable a
	
	System.out.println("The output is : " + (a++ + ++a + ++a + a++)); //printing this statement result on the output screen
	System.out.println("The output is : " + a-- + --a + --a + a--);
	
	
	
	//Post_decrement & Pre_decrement Operator
	
	int b = 30; //store the value of a variable b
	
	System.out.println("The output is : " + (b++ + ++b + ++b + b++)); //printing this statement result on the output screen
} //End of the main method 

} // End of the IncrementDecrementProgram class