/*
Program :- Write a java Program to Print (pre_increment ,post_increment, pre_decrement & post_decrement) operator
@Author :- Sweety Banerjee
Date:- 17 september 2022
#Timing :- 21:15pm

*/

class IncrementDecrementDemo  //Declaring the IncrementDecrementDemo class

{ //Class start from here

public static void main (String[]args) //Declaring the main Method 

{ // Main Method execution start from here 
	
	      //pre_increment ,post_increment Operator
	
	    int number1 = 13;  //store the value to the number1 variable with int datatype
		int number2 = ++number1; //increase the value of a variable by 1 then after value will be generated & store the value to the number2 variable
		int number3 = number2++; //increase the value of a variable by 1 before the value will be generated & store the value to the number3 variable
		
		//printing the value of these variable on the output screen
		System.out.println("The Number is : " + number2); 
		System.out.println("The Number is : " + number3);
		
		
		System.out.println();
		
		
		  //pre_decrement & post_decrement Operator
		  
		int number4 = 13; //store the value to the number4 variable with int datatype
		int number5 = --number1;  //decrease the value of a variable by 1 then after value will be generated & store the value to the number2 variable
		int number6 = number2--; //decrease the value of a variable by 1 before the value will be generated & store the value to the number3 variable
		
		
		//printing the value of these variable on the output screen
		System.out.println("The Number is : " + number5);
		System.out.println("The Number is : " + number6);
	
} //End of the main method

} //End of the IncrementDecrementDemo class