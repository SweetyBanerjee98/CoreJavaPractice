/* 
Program :- Write a java Program To print the Average of Three Subject
Average :- (a+b+c)/3
@Author :- Sweety Banerjee
Date:- 16 september 2022
Timing :- 7:34 pm

*/


class AverageProgramDemo  //Declaring the Class
{ //AverageProgramDemo class start with this curly braces

public static void main(String[]args) //Declaring the main method

{ //main method start with this braces


	/* int number1, number2, number3;  //Declaring this three variable with integer datatype
	number1= 100; //Initializing the value to the variable number1
	number2= 200; //Initializing the value to the variable number2
	number3= 300; //Initializing the value to the variable number3
	
	float average = (number1+number2+number3)/3; //total AverageNumber is store in  this average variable with float datatype
	
	System.out.println("The Number is : "+ average);  //printing the result & get  output
 */


//OR	

// Taking the input From the User
    int number1=Integer.parseInt(args[0]); //converting command line argument into integer
	int number2=Integer.parseInt(args[1]); //converting command line argument into integer
	int number3=Integer.parseInt(args[2]); //converting command line argument into integer
	
	float average =(number1+number2+number3)/3; //total AverageNumber is store in  this average variable with float datatype
	
	System.out.println("The Number is : "+average); //printing the result & get  output



	
	
}


}