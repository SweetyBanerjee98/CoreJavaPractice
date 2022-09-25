/*
Program:- Write a java Program to Print Typecasting
@Author :- Sweety Banerjee
Date :- 7 September 2022

*/

class TypecastingProgramDemo // Declaring the TypecastingProgramDemo class
{ //class start from here

public static void main(String[]args) //Declaring the main Method 

{  //Main  method Execution start

        
        short num1 = 10; //Declaring the value 10 to the num1 variable
        short num2 = 12;  // Declaring the value 12 to the num2 variable
        short sum1 = (short)(num1+num2); //Addition value store to the sum1 variable & typecasting
		int sum2 = (short)(num1+num2);  //Addition value store to the sum2 variable & typecasting

     System.out.println("The Number is : "+ sum1); 	//printing the sum1 value on the output screen
     System.out.println("The Number is : "+ sum2);	 //printing the sum2 value on the output screen
	 
	 
	 
        double num3 = 100;  //Declaring the value 100 to the num3 variable
        double num4 = 120;  //Declaring the value 120 to the num4 variable
        double sum3 = (int)(num3+num4);  //Addition value store to the sum3 variable & typecasting
		double sum4 = (short)(num3+num4);  //Addition value store to the sum4 variable & typecasting

     System.out.println("The Number is : "+ sum3); 	//printing the sum3 value on the output screen
     System.out.println("The Number is : "+ sum4); //printing the sum4 value on the output screen
	 
	 
	 
	 
        byte num5 = 100;  //Declaring the value 100 to the num5 variable
        byte num6 = 120;  //Declaring the value 120 to the num6 variable
        byte sum5 = (byte)(num5+num6);  //Addition value store to the sum5 variable & typecasting
		int sum6 = (num5+num6);  //Addition value store to the sum6 variable & typecasting

     System.out.println("The Number is : "+ sum5); 	//printing the sum5 value on the output screen
     System.out.println("The Number is : "+ sum6); //printing the sum6 value on the output screen


}  //End of the main Method 


}  //end of the class
