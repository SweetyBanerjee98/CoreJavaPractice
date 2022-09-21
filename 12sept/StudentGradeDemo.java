/*
Program :- Write a java program suppose
           A school has following rules for grading system
		   1) Below 25 - F 
		   2) 25 to 45 - E
		   3) 45 to 50 - D
		   4) 50 to 60 - C
		   5) 60 to 80 - B
		   6) Above 80 - A
   Ask user to enter marks and Print the corresponding grade
   
@Author :- Sweety Banerjee
Date :- 20 september 2022
# Time :- 19:26pm

*/

class StudentGradeDemo //Declaring the StudentGradeDemo class
{ //StudentGradeDemo class Starting With this curly braces
	
	
	static void gradingSystem(int number) //Declaring the gradingSystem method & passing the parameter
	{ //starting the mathod 
		
		
		//Run "if block" if the given condition is true
		if ((number>=80) &&  (number<=100))
		{
			System.out.println("Your Grade is A"); //printing the statement if condition true
		}
		
		//Run "else if" if the given condition is true
		else if((number>=60) && (number<=79))
		{
			System.out.println("Your Grade is B"); //printing the statement if "else if" condition true
		}
		
		//Run "else if" if the given condition is true
		else if((number>=50) && (number<=59))
		{
			System.out.println("Your Grade is C"); //printing the statement if "else if" condition true
		}
		
		//Run "else if" if the given condition is true
		else if((number>=45) && (number<=49))
		{
			System.out.println("Your Grade is D"); //printing the statement if "else if" condition true
		}
		
		//Run "else if" if the given condition is true
		else if((number>=25) && (number<=44))
		{
			System.out.println("Your Grade is E"); //printing the statement if "else if" condition true
		}
		
		//Run "else" if all the  conditions are false
		else
		{
			System.out.println("Your Grade is F"); //printing the statement if "else if" condition true
		}
	}
	//end of the method
	
	// Declaring the main Method
	public static void main(String[] args)
	{ //Starting the execution of Main Method
		
		//Taking input from the user
		int number = Integer.parseInt(args[0]); //converting command line argument into integer
		
		System.out.println(); //for new line
		
		
		gradingSystem(number); //Calling this method from the main method
		
		
	} //End of the main method
	
	
} //End of the StudentGradeDemo class

	



