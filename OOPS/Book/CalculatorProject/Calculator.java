/*
Program :- Write a Java Program To perform calculator operations
@Author :- Sweety Banerjee
Date:- 22 september 2022
*/

import java.util.Scanner;  //importing the required class


class Calculator //Declaring the class
{ //Starting the Main Method
	
	static double answer=0.0; //Declaring the variable & iitializing with zero float value
	
	
	
	double addition(double number1,double number2) //declaring the addition method 
	{
		return number1+number2; //return the addition result
	}
	
	double subtraction(double number1,double number2)   //declaring the subtraction method 
	{
		return number1-number2; //return the subtraction result
	}
	double multiplication(double number1,double number2) //declaring the multiplication method 
	{
		return number1*number2;  //return the multiplication result
	}
	double division(double number1,double number2)  //declaring the division method 
	{
		return number1/number2;  //return the division result
	}
	
	
	// Declaring the main Method
	public static void main(String...args)
	{
		
		Scanner sc = new Scanner(System.in); // create an object of Scanner class
		
		//declaring the variables
		double number1,number2;
		char operator,choice;
		
		System.out.println("--------------Calculator----------");  //Printing the statement
		System.out.println("Enter 2 numbers:");		//Printing the statement
		
		//input taking from the user
		number1= sc.nextDouble();
		number2= sc.nextDouble();
		
		Calculator cal = new Calculator(); //Creating an object of Calculator class
		
		while(true)  //checking the condition
		{
			System.out.println("Enter the operator: ");  // ask users to enter operator
			operator= sc.next().charAt(0); 
			
			//switch expression is evaluted once
			switch(operator) //Passing the operator into the switch 
			{ 
			
			              // performs addition between numbers
				case '+': Calculator.answer= cal.addition(number1,number2); 
				           break;                                            // It is used to terminates the block 
						   
						 // performs subtraction between numbers
			    case '-': Calculator.answer= cal.subtraction(number1,number2);
				           break;                                             // It is used to terminates the block 
						   
						 // performs multiplication between numbers
				case '*': Calculator.answer= cal.multiplication(number1,number2);
				           break;                                             // It is used to terminates the block 
						   
						 // performs division between numbers
			    case '/': Calculator.answer= cal.division(number1,number2);
				           break;                                              // It is used to terminates the block 
						   
						 ////if there is no matching then the default code block is executed
			   default: System.out.println("Wrong input");                        //Printing the statement
			   
			}  //End of the switch case
			
			System.out.println(number1+" "+operator+ " "+number2+" = "+Calculator.answer);
			System.out.println("Do you want to perform more operation"); //Printing the statement
			choice= sc.next().toLowerCase().charAt(0); //character input
			
			//if choice is yes , then if block will be executed 
			if(choice=='y')
			{
				number1= Calculator.answer; //Answer is storing the number1 variable 
				System.out.println("Enter the number: "); //Printing the statement
				number2= sc.nextDouble(); //taking input from the user
			} //end of if
			
			//if choice is no , then else block will be executed
			else
			{
				// It is used to terminates the block 
				break;
			} //end of else
			
		} //end of while loop
		
	}  // End of the main Method
	
	
}     //End of the class 