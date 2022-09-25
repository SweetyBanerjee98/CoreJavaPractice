/* 
Program :- Write a java Program To print the Average of Three Subject
Average :- (a+b+c)/3
@Author :- Sweety Banerjee
Date:- 6 september 2022


*/


class AverageProgramDemo  //Declaring the Class

{ //AverageProgramDemo class start 


     //Declaring the method
      static void average( int num1, int num2, int num3)  //Passing an argument fron the method
	   {
		
		
		float result = (num1+num2+num3)/3; //Calculate average of three number and store this in the result variable
		
		System.out.println(result); //printing the result
		
		
		
	   } //end of the average method


public static void main(String[]args) //Declaring the main method

{ //main method start with this braces

                    int num1=Integer.parseInt(args[0]);  //converting command line argument into integer
	                int num2=Integer.parseInt(args[1]);
	                int num3=Integer.parseInt(args[2]);
	
	                average( num1,num2,num3); //Calling the Average method from main method
	
	


/*<<<<<<<<<<----------------------------------------------------------------------------------------------------------------------------------------->>>>>>>>*/


	/* int number1, number2, number3;  //Declaring this three variable with integer datatype
	number1= 100; //Initializing the value to the variable number1
	number2= 200; //Initializing the value to the variable number2
	number3= 300; //Initializing the value to the variable number3
	
	float average = (number1+number2+number3)/3; //total AverageNumber is store in  this average variable with float datatype
	
	System.out.println("The Number is : "+ average);  //printing the result & get  output
 */


//OR-------------------------------------------------------------------------------------------------------------------------------------------------------->>>>>>>	

/* // Taking the input From the User
    int number1=Integer.parseInt(args[0]); //converting command line argument into integer
	int number2=Integer.parseInt(args[1]); 
	int number3=Integer.parseInt(args[2]); 
	
	float average =(number1+number2+number3)/3; //total AverageNumber is store in  this average variable with float datatype
	
	System.out.println("The Number is : "+average); //printing the result & get  output */

} //End of Main method


} //end of the class
