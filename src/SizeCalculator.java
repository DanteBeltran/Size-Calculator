import java.text.DecimalFormat;
import java.util.Scanner;

public class SizeCalculator { // declaring the variables for the class
	
	private Box firstBox;
	private Box secondBox;
	
	private String message;
	private DecimalFormat df = new DecimalFormat ("#.##");
	
	public SizeCalculator( ) { //
		firstBox = new Box();
		secondBox = new Box();
		message = "null";
		
	}
	
	public void inputBoxes() { // prompts the user to enter the dimensions for the 2 boxes, then this method runs the input dimensions methods
		System.out.println("Enter first box dimensions: ");
		firstBox.inputLength();
		firstBox.inputWidth();
		firstBox.inputHeight();
		System.out.println("Enter second box dimensions: ");
		secondBox.inputLength();
		secondBox.inputWidth();
		secondBox.inputHeight();
	}
	
	public void calculateSizes() { //this method creates variables for the volume of the 2 boxes and for an answer. Then it is followed by the if and else statements
		double volumeFirstBox;
		double volumeSecondBox;
		double answer = 1;
		volumeFirstBox = firstBox.calcVolume();
		volumeSecondBox = secondBox.calcVolume();
		
		if(volumeFirstBox == volumeSecondBox) {
			 message = "both are the same size";
			 
		}
		else if (volumeFirstBox > volumeSecondBox)
		{
			if ( (2 * volumeSecondBox - volumeFirstBox) > 0)
			{
					message = "the first box is slightly bigger than the second box";
			}
			
			
			else if ((3 * volumeSecondBox - volumeFirstBox) > 0 )
			{
				message = "The first box is twice the size of the second box";
			}
			
			
			else if ((4 * volumeSecondBox - volumeFirstBox) > 0)
			{
				
				message = "The first box is triple the size of the second box";
			}
			
			
			else if ((5 * volumeSecondBox - volumeFirstBox) > 0)
			{
				
				message = "The first box is quadruple the size of the second box";
			}
			
			
			else
			{ 
				answer = volumeFirstBox/volumeSecondBox;
				message = "The first box is "+ df.format(answer) + " times the size of the second box";
			}
			
			
			
		}
		
		else
		{
			message = "volume = " + volumeFirstBox + "/nvolume = " + volumeSecondBox;
			
			if ( (2 * volumeFirstBox - volumeSecondBox) > 0)
			{
					message = "the second box is slightly bigger than the first box";
			}
			
			
			
			else if ((3 * volumeFirstBox - volumeSecondBox) > 0 )
			{
				message = "The second box is twice the size of the first box";
			}
			
			
			
			else if ((4 * volumeFirstBox - volumeSecondBox) > 0)
			{
				
				message = "The second box is triple the size of the first box";
			}
			
			
			else if ((5 * volumeFirstBox - volumeSecondBox) > 0)
			{
				
				message = "The second box is quadruple the size of the first box";
			}
			
			
			else
			{ 
				answer = volumeSecondBox/volumeFirstBox;
				message = "The second box is "+ df.format(answer) + " times the size of the first box";
			}

		}
		
			
				
	}
	
	public void display() { // this method runs the display dimensions  and prints the results
		System.out.println("\nFirst Box: ");
		firstBox.displayDimensions();
		System.out.println(" volume = " +df.format(firstBox.calcVolume()));
		System.out.println("Second Box: ");
		secondBox.displayDimensions();
		System.out.println(" volume = " +df.format(secondBox.calcVolume()));
		System.out.println("\n" + message);
	}
}
