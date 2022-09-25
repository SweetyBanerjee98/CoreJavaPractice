/*
Program :- Write a java program to a implicit cast
@Author :- Sweety Banerjee 
#Date:- 8 september 2022
*/

class ImplicitCastProgram //Declaring the ImplicitCastProgram class

{  //class Start from here
	
	public static void main (String[]args) //Declaring the main method 
	
	{ //Main method exeution start
		
		int a=12; //12 value store in the variable a
		int b=20; //20 value store in the variable b
		
		b = (int)(b+30); //implicit casting 
		
		System.out.println("The value is "+ a); //printing the value of a 
		System.out.println("The value is "+ b); //printing the value of b
		
		
		System.out.println(); //for space
		
		
		byte c=120; //120 value store in the variable c
		byte d=79; //79 value store in the variable d
		
		d = (byte)(d+30); //implicit casting 
		
		System.out.println("The value is "+ c);  //printing the value of c 
		System.out.println("The value is "+ d);  //printing the value of d 
		
		
	}
	
	
	
}