import java.util.Scanner;
public class Box 
{
	private double length;
	private double width;
	private double height; 
	
	Scanner input = new Scanner (System.in);
	
	public Box()	//Default constructor
	{
		length= 1;
		width= 1;
		height= 1;
		
	}
	
	public Box(double lengthNew, double widthNew, double heightNew)	//initial constructor
	{
		length= lengthNew;
		width= widthNew;
		height= heightNew;
	}
	
	public Box (Box copyConstructor)	//copy constructor
	{
		length= copyConstructor.getLength();
		width= copyConstructor.getWidth();
		height= copyConstructor.getHeight();
	}

	public void inputLength()	//Setting the method for length
	{
		// this int I is simply a variable for me to play with, I am using it in this case to make sure my while loop functions properly
		int i=1;
		while(i!=0)
		{
			System.out.println("Enter length: ");
		try {
			length = input.nextDouble();
			// the users input must be between the min and max value, if not the user will be prompted to reset the calculator
			
	    	if(length<0)
	    	{
	    		System.err.print("Error: You cannot enter a negative number.\n\n ");
			
			}
	    	else
	    	{i=0;}
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error: You must enter a number.\n\n" );
				input.nextLine();
				
			}
		}
		
	    
	    
		
	}
	
	public void inputWidth()	//Setting the method for width
	{
		int i=1;
		while(i!=0)
		{
			System.out.println("Enter width: ");
		try {
			width = input.nextDouble();
			// the users input must be a positive number and not a word, if so the method will loop.
			
	    	if(width<0)
	    	{
	    		System.err.print("Error: You cannot enter a negative number.\n\n ");
			
			}
	    	else
	    	{i=0;}
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error: You must enter a number.\n\n" );
				input.nextLine();
				
			}
		}
		
	}
	
	public void inputHeight()	//Setting the method for height
	{
		int i=1;
		while(i!=0)
		{
			System.out.println("Enter height: ");
		try {
			height = input.nextDouble();
			// the users input must be a positive number and not a word, if so the method will loop.
			
	    	if(height<0)
	    	{
	    		System.err.print("Error: You cannot enter a negative number.\n\n ");
			
			}
	    	else
	    	{i=0;}
			} catch (java.util.InputMismatchException e) {
				System.err.println("Error: You must enter a number.\n\n" );
				input.nextLine();
				
			}
		}
	}
	
	public double getLength()	//get method for length
	{
		return length;
	}
	
	public double getWidth()	//get method for width
	{
		return width;
	}
	
	public double getHeight()	//get method for height
	{
		return height;
	}
	
	public void displayDimensions() //display method prints  the results
	{
		System.out.print(length + " X " + width + " X " + height);
	}
	
	public double calcVolume() //this method calculates the volume of the box
	{
		double boxVolume;
		boxVolume = length * width * height;
		return boxVolume;
	}
	

}
