/*****************************************************************************************************
 * Town.java
 * Hazel Cruz
 * 
 *This class shows the demographics of small town.
 *******************************************************************************************************/
import java.util.Scanner;

public class Town {
	
	private int numberOfAdults;
	private int numberOfChildren;
	
   //**********************************************************************
	
   //This method establishes initial values of instance variables.  
	
	public void initialize() {    
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of adults: ");
		this.numberOfAdults = sc.nextInt();
		System.out.print("Enter number of children: ");
		this.numberOfChildren = sc.nextInt();
		sc.close();
	} // end initialize
	
	//**********************************************************************
	
	 //This method simulates the birth of one child.
	
	public void simulateBirth() {
		
		 this.numberOfChildren++;
	} // end simulateBirth
	 
    //***********************************************************************
     
	// This method prints out the current vital statistics.
	
	public void printStatistics() {
		
		System.out.println("Number of Adults: " + this.numberOfAdults);
		System.out.println("Number of Children: " + this.numberOfChildren);
	} // end printStatistics
	
} // end class Town
