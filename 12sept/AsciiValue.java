/*
Program :- Write a Java program to print the Ascii value of a Character
a,e,i,o,u = vowel
others = consonant

@Author :- Sweety Banerjee
Date :- 12 september 2022

*/

//Declaring the AsciiValue class
class AsciiValue
{//AsciiValue class Starting With this curly braces

	static void convertValue(char charvalue) //Declaring convertValue method & Passing a parameter as a charvalue 
	{ //starting convertValue method
		
		//converting charvalue to a asciivalue
		int asciivalue = charvalue; 
		System.out.println("The Ascii value is : " + asciivalue); //printing the asciivalue of a character
		
	} //end of the convertValue method
	
	static void vowelConsonant( char charvalue) //Declaring vowelConsonant method & Passing a parameter as a charvalue 
	{ //
		
		int asciivalue = charvalue; //converting charvalue to a asciivalue
		
		
	/*-------------------------------------------------------------------------------------------------------------------------------------------------*/
		           /*                        NESTED IF-ELSE & IF-ELSE-IF LADDER STATEMENT                   */
	/*-------------------------------------------------------------------------------------------------------------------------------------------------*/
		
		
		//Run "if block" if the given condition is true
		if((asciivalue>=65) && (asciivalue<=90))
	   { //start if statement
			System.out.println("It's Capital Letter"); //printing the statement
		
		//Run "if block" if the given condition is true
	     if((charvalue=='A' || charvalue=='E' || charvalue=='I' || charvalue=='O' || charvalue=='U')) 
		 {
			System.out.println("The Character Input is Vowel "); //printing the statement
		 }
		//Run "else block" if the condition is false
		 else
		 {
			System.out.println("The Character Input is Consonant"); //printing the statement
			
		 }
	   }//end of if
		
		
		//Run "else if block" if the given condition is true
		else if((asciivalue>=97) && (asciivalue<=122))
	   { //starting else if 
			System.out.println("It's Small Letter"); //printing the statement
		
		//Run "if block" if the given condition is true
		 if((charvalue=='a' || charvalue=='e' || charvalue=='i' || charvalue=='o' || charvalue=='u'))
		{
			System.out.println("The Character Input is Vowel "); //printing the statement
		}
		
		//Run "else block" if the given condition is true
		else
		{
			System.out.println("The Character Input is Consonant"); //printing the statement
			
		}
		
	   }//end of else if block
	
	   //Run "else if block" if the given condition is true
	   else if((asciivalue>=48) && (asciivalue<=57))
	      {
			System.out.println("It's a Number"); //printing the statement
			
	      }
		//Run "else block" if all the condition is false
		else 
		{
			System.out.println("It's a Special Symbol"); //printing the statement
			
		}
				
		
		
	} //End of vowelConsonant method


// Declaring the main Method
public static void main(String[] args)

{ //Starting the execution of Main Method
	
	//Taking input from the user
	char charvalue  = args[0].charAt(0); //converting command line argument into character
	convertValue(charvalue); //calling convertValue method from main method
	
	vowelConsonant( charvalue); //calling vowelConsonant method from main method
	
} // End of the main Method



} //End of the AsciiValue class 