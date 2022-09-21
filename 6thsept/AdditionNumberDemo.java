/*
Program :- Write a Java Program To Print The Addition Of Two Numbers
@Addition :- 30+70 = 100
@Author :- Sweety Banerjee
Date:- 16 september 2022
Timing :- 18:58pm

*/

class AdditionNumberDemo //Declaring the AdditionNumberDemo class

{ //AdditionNumberDemo class Starting With this curly braces


	public static void main(String[]args) // Declaring the main Method
	
	{ //Starting the Main Method
	
	
		/* int number1 , number2, sum;  //Declaring the number1, number2 and sum variable with integer datatype
		number1= 30; //Initializing this 30 Value to the number1 variable
		number2=70; ////Initializing this 70 Value to the number2 variable
		sum = number1+number2; //Storing the addition value in this particular sum variable
		
		System.out.println("The sum of the Number is : " +sum); // then Printing the sum variable */
		
		
		
		//OR
		
		/* int number1, number2;
		number1 = 30;
		number2 = 70;
		
		System.out.println(number1+number2); */
		
		
		
		//OR
		
		//Take Integer Input  From the User
		int number1=Integer.parseInt(args[0]); //Converting command Line argument into integer
		int number2=Integer.parseInt(args[1]); //Converting command Line argument into integer
		
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); //Adding this argument & printing the sum result on the Output Screen 
		
		
		
	} // End of the main Method
	
	
} //End of the class with this curly braces
