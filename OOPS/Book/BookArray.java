/*
Program :- Write a Java Program To Print Book using array
@Author :- Sweety Banerjee
Date:- 20 september 2022


*/

//declaring a theatre class
class Library
{
  //declaring instance variables 
	private int serialNo;
	private String bookName;
	private String authorName;
	private double bookPrice;
	
	
	Library(int serialNo, String bookName, String authorName, double bookPrice)
	{
		this.serialNo=serialNo;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;
	}
		
		
	
	//method to display book
	void displayBook()
	{
		//printing the value using this keyword
		System.out.println("SerialNo: " + this.serialNo + "     "  +" BookName: " + this.bookName + "   " + " AuthorName: " + this.authorName + "   " + " BookPrice:" + this.bookPrice);
	}
	
	//end of method display
	
	
}
//end of class Library


//declaring class BookInput

class BookArray
{
	
	//declaring the main method
	public static void main(String...args)
	{

		Library book[] = new Library[4]; // creates an array of Book
		
		//creating objects of book
		book[0]= new Library(1, "Good Vibes Good Lifes", "Vex king",385);
		book[1]= new Library(2, "East of Eden", "John Steinbeck", 340);
		book[2]= new Library(3, "Wings Of Fire", "Apj", 300);
		book[3]= new Library(4, "Vile Bodies", "Evelyn Waugh", 670 );
		
		
		// displaying all the books in Library
		for(int i=0; i<book.length;i++)
		{
			book[i].displayBook();
		}
		
		
		/*LibraryB b1= new LibraryB();
		b1.displayBook();*/
	}
	
	//end of main method
	
	
}
//end of class BookArray